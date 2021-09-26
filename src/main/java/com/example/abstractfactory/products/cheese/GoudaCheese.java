package com.example.abstractfactory.products.cheese;

public class GoudaCheese extends Cheese {
    public GoudaCheese() {
        makeCheese();
    }

    @Override
    void makeCheese() {
        System.out.println("maked gouda cheese");
    }
}
