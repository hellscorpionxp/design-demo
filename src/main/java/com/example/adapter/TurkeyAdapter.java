package com.example.adapter;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {// turkey飞行距离短，多飞几次。。。
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

}
