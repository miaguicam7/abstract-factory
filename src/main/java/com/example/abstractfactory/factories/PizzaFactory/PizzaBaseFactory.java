package com.example.abstractfactory.factories.PizzaFactory;

import com.example.abstractfactory.products.pizza.Pizza;

public abstract class PizzaBaseFactory {
    protected Pizza pizza;

    public abstract Pizza createPizza();

}
