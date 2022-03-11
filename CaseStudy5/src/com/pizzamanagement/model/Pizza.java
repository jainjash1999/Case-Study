package com.pizzamanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pizza {

	@Id // Id annotation used for setting primary key
	private int pizzaNo;
	@Column(length = 15)
	private String pizzaType;
	private int pizzaPrice;
	@Column(length = 20)
	private String deliveryAdd;

	// getters and setters
	public int getPizzaNo() {
		return pizzaNo;
	}

	public void setPizzaNo(int pizzaNo) {
		this.pizzaNo = pizzaNo;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getPizzaPrice() {
		return pizzaPrice;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	public String getDeliveryAdd() {
		return deliveryAdd;
	}

	public void setDeliveryAdd(String deliveryAdd) {
		this.deliveryAdd = deliveryAdd;
	}

	// default constructor
	public Pizza() {
	}

	// parameterized constructor
	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		this.deliveryAdd = deliveryAdd;
	}

	// toString method
	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", deliveryAdd=" + deliveryAdd + "]";
	}

}