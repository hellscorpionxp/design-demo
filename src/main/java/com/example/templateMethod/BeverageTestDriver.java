package com.example.templateMethod;

public class BeverageTestDriver {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
