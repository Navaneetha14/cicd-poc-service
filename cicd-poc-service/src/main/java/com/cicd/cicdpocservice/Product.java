package com.cicd.cicdpocservice;

import java.math.BigDecimal;
import java.util.Date;

/**
 * This class holds the product details.
 * 
 */
public class Product {

	private int id;
	
	private String name;
	
	private BigDecimal price;
	
	private Date expiryDate1;
	
	private int quantityForExpiryDate1;
	
	private Date expiryDate2;
	
	private int quantityForExpiryDate2;
	
	private String brand;
	
	private float weight;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getExpiryDate1() {
		return expiryDate1;
	}

	public void setExpiryDate1(Date expiryDate1) {
		this.expiryDate1 = expiryDate1;
	}

	public int getQuantityForExpiryDate1() {
		return quantityForExpiryDate1;
	}

	public void setQuantityForExpiryDate1(int quantityForExpiryDate1) {
		this.quantityForExpiryDate1 = quantityForExpiryDate1;
	}

	public Date getExpiryDate2() {
		return expiryDate2;
	}

	public void setExpiryDate2(Date expiryDate2) {
		this.expiryDate2 = expiryDate2;
	}

	public int getQuantityForExpiryDate2() {
		return quantityForExpiryDate2;
	}

	public void setQuantityForExpiryDate2(int quantityForExpiryDate2) {
		this.quantityForExpiryDate2 = quantityForExpiryDate2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
