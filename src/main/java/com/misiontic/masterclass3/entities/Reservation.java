package com.misiontic.masterclass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idReservation;

  private Integer startDate;
  private Integer devolutionDate;
  private String status = "created";

  @ManyToOne
  @JoinColumn(name = "id")
  @JsonIgnoreProperties("reservations")
  private Motorbike motorbike;

  @ManyToOne
  @JoinColumn(name = "idClient")
  @JsonIgnoreProperties({ "reservations", "messages" })
  private Client client;

  private String score;

  public Integer getIdReservation() {
    return idReservation;
  }

  public void setIdReservation(Integer idReservation) {
    this.idReservation = idReservation;
  }

  public Integer getStartDate() {
    return startDate;
  }

  public void setStartDate(Integer startDate) {
    this.startDate = startDate;
  }

  public Integer getDevolutionDate() {
    return devolutionDate;
  }

  public void setDevolutionDate(Integer devolutionDate) {
    this.devolutionDate = devolutionDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Motorbike getMotorbike() {
    return motorbike;
  }

  public void setMotorbike(Motorbike motorbike) {
    this.motorbike = motorbike;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }
}
