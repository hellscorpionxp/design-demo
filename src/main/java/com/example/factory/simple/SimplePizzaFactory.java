package com.example.factory.simple;

import com.example.factory.Pizza;

//简单工厂例子
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
