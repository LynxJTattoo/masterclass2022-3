package com.misiontic.masterclass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idMessage;

  private String messageText;
  

  @ManyToOne
  @JoinColumn(name = "categoryId")
  @JsonIgnoreProperties("products")
  private Category category;
  private Client client;
  private Motorbike motorbike;
  
  public Integer getIdMessage() {
    return idMessage;
  }
  public void setIdMessage(Integer idMessage) {
    this.idMessage = idMessage;
  }
  public String getMessageText() {
    return messageText;
  }
  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }
  public Category getCategory() {
    return category;
  }
  public void setCategory(Category category) {
    this.category = category;
  }
  public Client getClient() {
    return client;
  }
  public void setClient(Client client) {
    this.client = client;
  }
  public Motorbike getMotorbike() {
    return motorbike;
  }
  public void setMotorbike(Motorbike motorbike) {
    this.motorbike = motorbike;
  }


}
