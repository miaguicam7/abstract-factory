package com.example.abstractfactory.products.pizza;

import com.example.abstractfactory.factories.ToppingFactory.NapolitanaToppingFactory;
import org.springframework.stereotype.Component;

@Component
public class NapolitanaPizza extends Pizza {

    private final NapolitanaToppingFactory napolitanaToppingFactory;

    public NapolitanaPizza(NapolitanaToppingFactory napolitanaToppingFactory) {
        this.napolitanaToppingFactory = napolitanaToppingFactory;
        addIngredients();
        System.out.println("added napolitana pizza ingredients");
    }

    @Override
    void addIngredients() {
        cheese = napolitanaToppingFactory.addCheese();
        sauce = napolitanaToppingFactory.addSouce();
    }
}
