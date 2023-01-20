package com.mindstixapps.ProductRest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  private Integer id;
  private String name;
  private float price;
  private String category;

  public Product(Integer id, String name, float price, String category) {
    super();
    this.id = id;
    this.name = name;
    this.price = price;
    this.category = category;
  }

  public Product() {
    super();
    // TODO Auto-generated constructor stub
  }

}
