package com.misiontic.masterclass3.repository.crudRepository;

import com.misiontic.masterclass3.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository
  extends CrudRepository<Category, Integer> {}
