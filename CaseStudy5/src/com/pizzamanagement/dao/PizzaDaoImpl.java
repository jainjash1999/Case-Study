package com.pizzamanagement.dao;

import javax.persistence.EntityManager;
import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao {

	private EntityManager entityManager;

	public PizzaDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addPizza(Pizza pizza) {
		entityManager.persist(pizza);
	}

	@Override
	public void updatePizza(Pizza pizza) {
		entityManager.merge(pizza);
	}

	@Override
	public void deletePizza(Pizza pizza) {
		entityManager.remove(pizza);
	}

	@Override
	public Pizza getPizzaByNo(int no) {
		Pizza pizza = entityManager.find(Pizza.class, no);
		return pizza;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

}