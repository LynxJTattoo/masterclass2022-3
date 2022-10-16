package com.misiontic.masterclass3.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idReservation;


  private Integer startDate;
  private Integer devolutionDate;
  private String status;
  private Motorbike motorbike;
  private Category category;
  private Message messages;
  private Client client;
  
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
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }
  public Message getMessages() {
    return messages;
  }
  public void setMessages(Message messages) {
    this.messages = messages;
  }
  public Client getClient() {
    return client;
  }
  public void setClient(Client client) {
    this.client = client;
  }


  

}
