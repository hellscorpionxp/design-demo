package com.example.decorate;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize().equals(SIZE.TALL)) {
            cost += .10;
        } else if (beverage.getSize().equals(SIZE.GRANDE)) {
            cost += .15;
        } else if (beverage.getSize().equals(SIZE.VENTI)) {
            cost += .20;
        }
        return cost;
    }

}
