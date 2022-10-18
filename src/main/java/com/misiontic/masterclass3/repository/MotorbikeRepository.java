package com.misiontic.masterclass3.repository;

import com.misiontic.masterclass3.entities.Motorbike;
import com.misiontic.masterclass3.repository.crudRepository.MotorbikeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MotorbikeRepository {

  @Autowired
  private MotorbikeCrudRepository motorbikeCrudRepository;

  public List<Motorbike> getAll() {
    return (List<Motorbike>) motorbikeCrudRepository.findAll();
  }

  public Optional<Motorbike> getMotorbike(int id) {
    return motorbikeCrudRepository.findById(id);
  }

  public Motorbike save(Motorbike n) {
    return motorbikeCrudRepository.save(n);
  }

  public void delete(Motorbike n) {
    motorbikeCrudRepository.delete(n);
  }
}
