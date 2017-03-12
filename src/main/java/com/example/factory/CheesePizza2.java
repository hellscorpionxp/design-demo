package com.example.factory;

//根据PizzaIngredientFactory重写CheesePizza
public class CheesePizza2 extends Pizza2 {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza2(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

}
