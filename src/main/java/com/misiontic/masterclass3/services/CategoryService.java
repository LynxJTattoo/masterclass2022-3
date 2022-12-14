package com.misiontic.masterclass3.services;

import com.misiontic.masterclass3.entities.Category;
import com.misiontic.masterclass3.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> getAll() {
    return categoryRepository.getAll();
  }

  public Optional<Category> getProduct(int id) {
    return categoryRepository.getCategory(id);
  }

  public Category save(Category c) {
    if (c.getId() == null) {
      return categoryRepository.save(c);
    } else {
      Optional<Category> e = categoryRepository.getCategory(c.getId());
      if (e.isPresent()) {
        return c;
      } else {
        return categoryRepository.save(c);
      }
    }
  }

  public Category update(Category c) {
    if (c.getId() != null) {
      Optional<Category> q = categoryRepository.getCategory(c.getId());
      if (q.isPresent()) {
        if (c.getName() != null) {
          q.get().setName(c.getName());
        }
        if (c.getDescription() != null) {
          q.get().setDescription(c.getDescription());
        }
        if (c.getMotorbikes() != null) {
          q.get().setMotorbikes(c.getMotorbikes());
        }

        categoryRepository.save(q.get());
        return q.get();
      } else {
        return c;
      }
    } else {
      return c;
    }
  }

  public boolean delete(int id) {
    boolean flag = false;
    Optional<Category> c = categoryRepository.getCategory(id);
    if (c.isPresent()) {
      categoryRepository.delete(c.get());
      flag = true;
    }

    return flag;
  }
}
