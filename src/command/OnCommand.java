package command;

public class OnCommand implements Command{

    private HomeElectronics homeElectronics;

    public OnCommand(HomeElectronics homeElectronics) {
        this.homeElectronics = homeElectronics;
    }

    @Override
    public void execute() {
        homeElectronics.turnOn();
    }
}
