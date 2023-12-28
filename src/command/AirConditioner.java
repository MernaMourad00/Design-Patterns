package command;

public class AirConditioner implements HomeElectronics{
    @Override
    public void turnOn() {
        System.out.println("ac is on");
    }

    @Override
    public void turnOff() {
        System.out.println("ac is off");

    }
}
