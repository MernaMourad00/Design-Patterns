package builder;

public abstract class IPizzaBuilder {
    Pizza pizza;

    public abstract void setDough();
    public abstract void setSauce();
    public abstract void setTopping();

    public Pizza getPizza(){
        return pizza;
    }



}
