package facade;

public class ShopKeeper {

    Blackberry blackberry;
    IPhone iPhone;
    Samsung samsung;

    public ShopKeeper() {
        blackberry = new Blackberry();
        iPhone = new IPhone();
        samsung = new Samsung();
    }

    public void getIphoneInfo(){
        iPhone.getModelNumber();
        iPhone.getPrice();
    }

    public void getSamsungInfo(){
        samsung.getModelNumber();
        samsung.getPrice();
    }
    public void getBlackberryInfo(){
        blackberry.getModelNumber();
        blackberry.getPrice();
    }


}
