package com.example.factory;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
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
