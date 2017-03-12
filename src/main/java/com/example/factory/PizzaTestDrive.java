package com.example.factory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        // 抽象工厂方法
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());

        // 抽象工厂
        PizzaStore2 nyStore2 = new NYPizzaStore2();
        PizzaStore2 chicagoStore2 = new ChicagoPizzaStore2();
        Pizza2 pizza2 = nyStore2.orderPizza("cheese");
        System.out.println("Ethan2 ordered a " + pizza2.getName());
        pizza2 = chicagoStore2.orderPizza("cheese");
        System.out.println("Joel2 ordered a " + pizza2.getName());
    }

}
