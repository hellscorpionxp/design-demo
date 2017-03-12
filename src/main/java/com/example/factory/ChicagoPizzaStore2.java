package com.example.factory;

//根据PizzaIngredientFactory重写ChicagoPizzaStore
public class ChicagoPizzaStore2 extends PizzaStore2 {

    public Pizza2 createPizza(String type) {
        Pizza2 pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza2(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            // TODO
        }
        if (type.equals("clam")) {
            // TODO
        }
        if (type.equals("veggie")) {
            // TODO
        }

        return pizza;
    }

}
