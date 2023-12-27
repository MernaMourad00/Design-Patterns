package builder;

public class HawaianPizza extends IPizzaBuilder{
    @Override
    public void setDough() {
        System.out.println("baked dough");
    }

    @Override
    public void setSauce() {
        System.out.println("hot sauce");
    }

    @Override
    public void setTopping() {
        System.out.println("peperoni");
    }
}
