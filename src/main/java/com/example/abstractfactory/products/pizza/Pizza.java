package com.example.abstractfactory.products.pizza;

import com.example.abstractfactory.products.cheese.Cheese;
import com.example.abstractfactory.products.sauce.Sauce;

public abstract class Pizza {
    protected Sauce sauce;
    protected Cheese cheese;

    abstract void addIngredients();

    public void bakePizza() {
        System.out.println("baking pizza");
    }


}
