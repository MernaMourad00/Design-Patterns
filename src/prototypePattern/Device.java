package prototypePattern;

public abstract class Device implements Cloneable {

    private String manufacturerName;
    private Integer RAM;
    private Integer screenSize;
    private Integer price;
    private Integer quantity;

    public Device(String manufacturerName, Integer RAM, Integer screenSize, Integer price, Integer quantity) {
        this.manufacturerName = manufacturerName;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayCharacteristics() {
        System.out.println("Manufacturer: " + manufacturerName);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}