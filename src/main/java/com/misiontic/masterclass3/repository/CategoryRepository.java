package com.misiontic.masterclass3.repository;

import com.misiontic.masterclass3.entities.Category;
import com.misiontic.masterclass3.repository.crudRepository.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

  @Autowired
  private CategoryCrudRepository categoryCrudRepository;

  public List<Category> getAll() {
    return (List<Category>) categoryCrudRepository.findAll();
  }

  public Optional<Category> gOptional(int id) {
    return categoryCrudRepository.findById(id);
  }

  public Category save(Category c) {
    return categoryCrudRepository.save(c);
  }

  public void delete(Category c) {
    categoryCrudRepository.delete(c);
  }

public Optional<Category> getCategory(int id) {
    return null;
}
}