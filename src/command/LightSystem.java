package command;

public class LightSystem implements HomeElectronics{
    @Override
    public void turnOn() {
        System.out.println("light system is on");
    }

    @Override
    public void turnOff() {
        System.out.println("light system is off");
    }
}
