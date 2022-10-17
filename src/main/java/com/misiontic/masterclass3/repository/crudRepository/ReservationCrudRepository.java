package com.misiontic.masterclass3.repository.crudRepository;

import com.misiontic.masterclass3.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository
  extends CrudRepository<Reservation, Integer> {}
