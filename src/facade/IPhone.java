package facade;

public class IPhone implements Mobile{
    @Override
    public void getModelNumber() {
        System.out.println("IPhone 12 pro");
    }

    @Override
    public void getPrice() {
        System.out.println("price is 25,000 LE");
    }
}
