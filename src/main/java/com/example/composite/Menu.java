package com.example.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------");
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }

    @Override
    Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

}
