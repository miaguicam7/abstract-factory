package com.example.abstractfactory.factories.ToppingFactory;

import com.example.abstractfactory.products.cheese.Cheese;
import com.example.abstractfactory.products.sauce.Sauce;

public abstract class ToppingBaseFactory {
    abstract Sauce addSouce();

    abstract Cheese addCheese();
}
