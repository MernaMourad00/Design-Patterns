package facade;

public class Blackberry implements Mobile{
    @Override
    public void getModelNumber() {
        System.out.println("blackberry 1223");
    }

    @Override
    public void getPrice() {
        System.out.println("price is 5,000 LE");

    }
}
