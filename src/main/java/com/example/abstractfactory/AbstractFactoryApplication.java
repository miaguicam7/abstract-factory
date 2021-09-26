package com.example.abstractfactory;

import com.example.abstractfactory.factories.PizzaFactory.BarbacuePizzaFactory;
import com.example.abstractfactory.factories.PizzaFactory.NapolitanaPizzaFactory;
import com.example.abstractfactory.products.pizza.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

    private final BarbacuePizzaFactory barbacuePizzaFactory;
    private final NapolitanaPizzaFactory napolitanaPizzaFactory;

    public AbstractFactoryApplication(BarbacuePizzaFactory barbacuePizzaFactory, NapolitanaPizzaFactory napolitanaPizzaFactory) {
        this.barbacuePizzaFactory = barbacuePizzaFactory;
        this.napolitanaPizzaFactory = napolitanaPizzaFactory;
        createPizzas();
    }

    private void createPizzas() {
        Pizza barbacuePizza = barbacuePizzaFactory.createPizza();
        barbacuePizza.bakePizza();
        Pizza napolitanaPizza = napolitanaPizzaFactory.createPizza();
        napolitanaPizza.bakePizza();

    }

    public static void main(String[] args) {
        SpringApplication.run(AbstractFactoryApplication.class, args);
    }

}
