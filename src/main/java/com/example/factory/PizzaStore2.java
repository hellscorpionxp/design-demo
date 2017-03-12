package com.example.factory;

//根据PizzaIngredientFactory重写PizzaStore
public abstract class PizzaStore2 {

    public final Pizza2 orderPizza(String type) {
        Pizza2 pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 抽象工厂方法
    abstract Pizza2 createPizza(String type);

}
