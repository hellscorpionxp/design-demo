package com.example.decorate;

public abstract class Beverage {

    String description = "Unknown Beverage";

    enum SIZE {
        TALL, GRANDE, VENTI
    };

    private SIZE size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

}
