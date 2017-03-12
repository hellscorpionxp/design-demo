package com.example.factory;

//根据PizzaIngredientFactory重写ClamPizza
public class ClamPizza2 extends Pizza2 {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza2(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }

}
