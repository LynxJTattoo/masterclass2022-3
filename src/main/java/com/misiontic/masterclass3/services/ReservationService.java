package com.misiontic.masterclass3.services;

import com.misiontic.masterclass3.entities.Reservation;
import com.misiontic.masterclass3.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

  @Autowired
  private ReservationRepository reservationRepository;

  public List<Reservation> getAll() {
    return reservationRepository.getAll();
  }

  public Optional<Reservation> getReservation(int id) {
    return reservationRepository.getReservation(id);
  }

  public Reservation save(Reservation p) {
    if (p.getIdReservation() == null) {
      return reservationRepository.save(p);
    } else {
      Optional<Reservation> e = reservationRepository.getReservation(
        p.getIdReservation()
      );
      if (e.isPresent()) {
        return p;
      } else {
        return reservationRepository.save(p);
      }
    }
  }

  public Reservation update(Reservation p) {
    if (p.getIdReservation() != null) {
      Optional<Reservation> q = reservationRepository.getReservation(
        p.getIdReservation()
      );
      if (q.isPresent()) {
        if (p.getStartDate() != null) {
          q.get().setStartDate(p.getStartDate());
        }
        if (p.getDevolutionDate() != null) {
          q.get().setDevolutionDate(p.getDevolutionDate());
        }
        if (p.getStatus() != null) {
          q.get().setStatus(p.getStatus());
        }
        if (p.getMotorbike() != null) {
          q.get().setMotorbike(p.getMotorbike());
        }
        if (p.getCategory() != null) {
          q.get().setCategory(p.getCategory());
        }
        if (p.getMessages() != null) {
          q.get().setMessages(p.getMessages());
        }
        if (p.getClient() != null) {
          q.get().setClient(p.getClient());
        }
        reservationRepository.save(q.get());
        return q.get();
      } else {
        return p;
      }
    } else {
      return p;
    }
  }

  public boolean delete(int id) {
    boolean flag = false;
    Optional<Reservation> p = reservationRepository.getReservation(id);
    if (p.isPresent()) {
      reservationRepository.delete(p.get());
      flag = true;
    }

    return flag;
  }
}
