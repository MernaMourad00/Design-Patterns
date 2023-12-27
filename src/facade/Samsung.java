package facade;

public class Samsung implements Mobile{
    @Override
    public void getModelNumber() {
        System.out.println("Samsung galaxy S22");
    }

    @Override
    public void getPrice() {
        System.out.println("price is 27,000 LE");
    }
}
