package com.misiontic.masterclass3.services;

import com.misiontic.masterclass3.entities.Motorbike;
import com.misiontic.masterclass3.repository.MotorbikeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorbikeService {

  @Autowired
  private MotorbikeRepository motorbikeRepository;

  public List<Motorbike> getAll() {
    return motorbikeRepository.getAll();
  }

  public Optional<Motorbike> getMotorbike(int id) {
    return motorbikeRepository.getMotorbike(id);
  }

  public Motorbike save(Motorbike n) {
    if (n.getId() == null) {
      return motorbikeRepository.save(n);
    } else {
      Optional<Motorbike> e = motorbikeRepository.getMotorbike(n.getId());
      if (e.isPresent()) {
        return n;
      } else {
        return motorbikeRepository.save(n);
      }
    }
  }

  public Motorbike update(Motorbike n) {
    if (n.getId() != null) {
      Optional<Motorbike> q = motorbikeRepository.getMotorbike(n.getId());
      if (q.isPresent()) {
        if (n.getName() != null) {
          q.get().setName(n.getName());
        }
        if (n.getDescription() != null) {
          q.get().setDescription(n.getDescription());
        }
        if (n.getBrand() != null) {
          q.get().setBrand(n.getBrand());
        }
        if (n.getYear() != null) {
          q.get().setYear(n.getYear());
        }
        if (n.getCategory() != null) {
          q.get().setCategory(n.getCategory());
        }
        if (n.getMessages() != null) {
          q.get().setMessages(n.getMessages());
        }
        if (n.getReservations() != null) {
          q.get().setReservations(n.getReservations());
        }

        motorbikeRepository.save(q.get());
        return q.get();
      } else {
        return n;
      }
    } else {
      return n;
    }
  }

  public boolean delete(int id) {
    boolean flag = false;
    Optional<Motorbike> n = motorbikeRepository.getMotorbike(id);
    if (n.isPresent()) {
      motorbikeRepository.delete(n.get());
      flag = true;
    }

    return flag;
  }
}
