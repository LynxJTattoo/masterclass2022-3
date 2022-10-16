package com.misiontic.masterclass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "motorbike")
public class Motorbike implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;
  private String brand;
  private Integer year;
  private String description;


  @ManyToOne
  @JoinColumn(name = "categoryId")
  @JsonIgnoreProperties("products")
  private Category category;

  private List<Message> messages;
  private List<Reservation> reservations;


  public Integer getId() {
    return id;
  }


  public List<Message> getMessages() {
    return messages;
  }


  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  public List<Reservation> getReservations() {
    return reservations;
  }


  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }


  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }


}
