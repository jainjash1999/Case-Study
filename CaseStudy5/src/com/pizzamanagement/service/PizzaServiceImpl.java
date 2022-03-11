package com.pizzamanagement.service;

import com.pizzamanagement.dao.PizzaDao;
import com.pizzamanagement.dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService {

	private PizzaDao daoOBJ;

	public PizzaServiceImpl() {

		daoOBJ = new PizzaDaoImpl();
	}

	@Override
	public void addPizza(Pizza pizza) {
		daoOBJ.beginTransaction();
		daoOBJ.addPizza(pizza);
		daoOBJ.commitTransaction();
	}

	@Override
	public void updatePizza(Pizza pizza) {
		daoOBJ.beginTransaction();
		daoOBJ.updatePizza(pizza);
		daoOBJ.commitTransaction();
	}

	@Override
	public void deletePizza(Pizza pizza) {
		daoOBJ.beginTransaction();
		daoOBJ.deletePizza(pizza);
		daoOBJ.commitTransaction();
	}

	@Override
	public Pizza findPizzaByNo(int no) {
		Pizza pizza = daoOBJ.getPizzaByNo(no);
		return pizza;
	}

}