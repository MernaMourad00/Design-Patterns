package prototypePattern;

public abstract class Device implements Cloneable {

   private String manufacturerName;
    private Integer RAM;
    private Integer screenSize;
    private Integer price;
    private Integer quantity;

    public void showTotalPrice(){
        System.out.println("total price =  "+price*quantity);
    }
    public void displayCharactristics(){
        System.out.println("el chaarct bta3 bta3 el device");
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Device(String manufacturerName, Integer RAM, Integer screenSize, Integer price, Integer quantity) {
        this.manufacturerName = manufacturerName;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.price = price;
        this.quantity = quantity;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
