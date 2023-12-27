package builder;

public class SpicyPizza extends IPizzaBuilder{


    @Override
    public void setDough() {
        System.out.println("cross dough");
    }

    @Override
    public void setSauce() {
        System.out.println("mild");
    }

    @Override
    public void setTopping() {
        System.out.println("meat");
    }
}
