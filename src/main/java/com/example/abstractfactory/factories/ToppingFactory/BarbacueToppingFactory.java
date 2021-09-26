package com.example.abstractfactory.factories.ToppingFactory;

import com.example.abstractfactory.products.cheese.Cheese;
import com.example.abstractfactory.products.cheese.GoudaCheese;
import com.example.abstractfactory.products.sauce.BarbacueSauce;
import com.example.abstractfactory.products.sauce.Sauce;
import org.springframework.stereotype.Component;

@Component
public class BarbacueToppingFactory extends ToppingBaseFactory {

    @Override
    public Sauce addSouce() {
        return new BarbacueSauce();
    }

    @Override
    public Cheese addCheese() {
        return new GoudaCheese();
    }
}
