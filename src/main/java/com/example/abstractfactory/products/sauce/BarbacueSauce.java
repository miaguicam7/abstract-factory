package com.example.abstractfactory.products.sauce;

public class BarbacueSauce extends Sauce {

    public BarbacueSauce() {
        makeSauce();
    }

    @Override
    void makeSauce() {
        System.out.println("maked barbacue sauce");
    }
}
