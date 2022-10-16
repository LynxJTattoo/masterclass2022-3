package com.misiontic.masterclass3.repository;

import com.misiontic.masterclass3.entities.Reservation;
import com.misiontic.masterclass3.repository.crudRepository.ReservationCrudRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {

  @Autowired
  private ReservationCrudRepository reservationCrudRepository;

  public List<Reservation> getAll() {
    return (List<Reservation>) reservationCrudRepository.findAll();
  }

  public Optional<Reservation> getReservation(int id) {
    return reservationCrudRepository.findById(id);
  }

  public Reservation save(Reservation p) {
    return reservationCrudRepository.save(p);
  }

  public void delete(Reservation p) {
    reservationCrudRepository.delete(p);
  }
}
