package com.temperature.temperaturemeasure.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Tempreature {

  private @Id @GeneratedValue Long id;
  private Long temperature;
  private String location;

  Tempreature() {}

  Tempreature(Long temperature, String location) {
        this.temperature = temperature
        this.location
    }

  public Long getId() {
    return this.id;
  }

  public Long getTempreature() {
    return this.tempreature;
  }

  public String getLocation() {
    return this.location;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTempreature(Long tempreature) {
    this.tempreature = temperature;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Tempreature))
      return false;
    Tempreature temperature = (tempreature) o;
    return Objects.equals(this.id, Tempreature.id) && Objects.equals(this.temperature, Tempreature.temperature)
        && Objects.equals(this.location, Tempreature.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.temperature, this.location);
  }

  @Override
  public String toString() {
    return "Tempreature{" + "id=" + this.id + ", tempreature='" + this.tempreature + '\'' + ", location='" + this.location + '\'' + '}';
  }

}

