package com.example.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

}
