package com.pizzamanagement.dao;

import com.pizzamanagement.model.Pizza;
public interface PizzaDao {
	
	Pizza getPizzaByNo(int no);
	void addPizza(Pizza pizza);
	void updatePizza(Pizza pizza);
	void deletePizza(Pizza pizza);
	void commitTransaction();
	void beginTransaction();
	
}