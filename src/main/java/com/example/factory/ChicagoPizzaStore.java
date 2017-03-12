package com.example.factory;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
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
