package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="electric")
public class ElectronicEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String brand;
private int price;
private int modelyear;
private int noofdoors;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getModelyear() {
	return modelyear;
}
public void setModelyear(int modelyear) {
	this.modelyear = modelyear;
}
public int getNoofdoors() {
	return noofdoors;
}
public void setNoofdoors(int noofdoors) {
	this.noofdoors = noofdoors;
}


}
