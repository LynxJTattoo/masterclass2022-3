package com.misiontic.masterclass3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.misiontic.masterclass3.entities.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>  {
    
}
