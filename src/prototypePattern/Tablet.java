package prototypePattern;

public class Tablet extends Device{
    public Tablet(String manufacturerName, Integer RAM, Integer screenSize, Integer price, Integer quantity) {
        super(manufacturerName, RAM, screenSize, price, quantity);
    }


    @Override
    public Device clone() {
        return super.clone();
    }
}
