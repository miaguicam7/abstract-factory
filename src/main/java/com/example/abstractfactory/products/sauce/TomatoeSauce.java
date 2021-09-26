package com.example.abstractfactory.products.sauce;

public class TomatoeSauce extends Sauce {

    public TomatoeSauce() {
        makeSauce();
    }

    @Override
    void makeSauce() {
        System.out.println("maked tomatoe sauce");
    }
}
