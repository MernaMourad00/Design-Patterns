package builder;

import java.util.Locale;

public class Waiter {

    IPizzaBuilder builder;

    public Waiter(IPizzaBuilder builder) {
        this.builder = builder;
    }

    public void constructPizza(){
        builder.setDough();
        builder.setSauce();
        builder.setTopping();
    }

    public IPizzaBuilder getpizzaorder(){
        return builder;
    }

}
