package com.example.abstractfactory.factories.PizzaFactory;

import com.example.abstractfactory.products.pizza.NapolitanaPizza;
import com.example.abstractfactory.products.pizza.Pizza;
import org.springframework.stereotype.Component;

@Component
public class NapolitanaPizzaFactory extends PizzaBaseFactory {

    private final NapolitanaPizza napolitanaPizza;

    public NapolitanaPizzaFactory(NapolitanaPizza napolitanaPizza) {
        this.napolitanaPizza = napolitanaPizza;
    }

    @Override
    public Pizza createPizza() {
        return napolitanaPizza;
    }
}
