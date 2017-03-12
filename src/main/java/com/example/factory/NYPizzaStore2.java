package com.example.factory;

//根据PizzaIngredientFactory重写NYPizzaStore
public class NYPizzaStore2 extends PizzaStore2 {

    public Pizza2 createPizza(String type) {
        Pizza2 pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza2(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
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
