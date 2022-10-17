package com.misiontic.masterclass3.repository.crudRepository;

import com.misiontic.masterclass3.entities.Motorbike;
import org.springframework.data.repository.CrudRepository;

public interface MotorbikeCrudRepository
  extends CrudRepository<Motorbike, Integer> {}
