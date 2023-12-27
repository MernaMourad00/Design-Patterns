package adapter;

public class Adapter implements TypeCCharger{

    MicroUSB microUSB;

    public Adapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    @Override
    public void chargingTypeC() {
        System.out.println("converting from type c to micro usb");
        microUSB.charging();
    }
}
