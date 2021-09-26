package com.example.abstractfactory.factories.PizzaFactory;

import com.example.abstractfactory.products.pizza.Pizza;
import org.springframework.stereotype.Component;

@Component
public class BarbacuePizzaFactory extends PizzaBaseFactory {

    private final Pizza barbacuePizza;

    public BarbacuePizzaFactory(Pizza barbacuePizza) {
        this.barbacuePizza = barbacuePizza;
    }

    @Override
    public Pizza createPizza() {
        return barbacuePizza;
    }
}
