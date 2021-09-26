package com.example.abstractfactory.factories.ToppingFactory;

import com.example.abstractfactory.products.cheese.Cheese;
import com.example.abstractfactory.products.cheese.GranaPadanoCheese;
import com.example.abstractfactory.products.sauce.Sauce;
import com.example.abstractfactory.products.sauce.TomatoeSauce;
import org.springframework.stereotype.Component;

@Component
public class NapolitanaToppingFactory extends ToppingBaseFactory {

    @Override
    public Sauce addSouce() {
        return new TomatoeSauce();
    }

    @Override
    public Cheese addCheese() {
        return new GranaPadanoCheese();
    }
}
