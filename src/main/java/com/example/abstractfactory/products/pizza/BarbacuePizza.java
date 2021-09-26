package com.example.abstractfactory.products.pizza;

import com.example.abstractfactory.factories.ToppingFactory.BarbacueToppingFactory;
import org.springframework.stereotype.Component;

@Component
public class BarbacuePizza extends Pizza {

    private final BarbacueToppingFactory barbacueToppingFactory;

    public BarbacuePizza(BarbacueToppingFactory barbacueToppingFactory) {
        this.barbacueToppingFactory = barbacueToppingFactory;
        addIngredients();
        System.out.println("added barbacue pizza ingredients");
    }

    @Override
    void addIngredients() {
        sauce = barbacueToppingFactory.addSouce();
        cheese = barbacueToppingFactory.addCheese();
    }
}
