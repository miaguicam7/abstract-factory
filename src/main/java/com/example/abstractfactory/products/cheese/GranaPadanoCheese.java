package com.example.abstractfactory.products.cheese;

public class GranaPadanoCheese extends Cheese {

    public GranaPadanoCheese() {
        makeCheese();
    }

    @Override
    void makeCheese() {
        System.out.println("maked grana padano  cheese");
    }
}
