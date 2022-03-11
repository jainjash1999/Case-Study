package com.pizzamanagement.ui;

import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		PizzaService service = new PizzaServiceImpl();
		
		Pizza pizza1 = new Pizza(1, "marg", 199, "dubai");
		//Pizza pizza2 = new Pizza(2, "cheezBurst", 799, "agra");
		//Pizza pizza3 = new Pizza(3, "farmhouse", 699, "jaipur");
		
		service.addPizza(pizza1);
		//service.addPizza(pizza2);
		//service.addPizza(pizza3);
		
		/*Pizza pizza122 = service.findPizzaByNo(122);
		System.out.println(pizza122);
		pizza3 = new Pizza(123, "xyz", 699, "xyz");
		service.updatePizza(pizza3);
		System.out.println(service.findPizzaByNo(123));
		service.deletePizza(pizza2);
		System.out.println(service.findPizzaByNo(122));
		Pizza pizza4 = new Pizza(122, "xyz", 699, "xyz");
		service.addPizza(pizza4);
		System.out.println(service.findPizzaByNo(122));*/
	}
}