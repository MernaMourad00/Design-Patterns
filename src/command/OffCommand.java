package command;

public class OffCommand implements Command{
    private HomeElectronics homeElectronics;

    public OffCommand(HomeElectronics homeElectronics) {
        this.homeElectronics = homeElectronics;
    }
    @Override
    public void execute() {
        homeElectronics.turnOff();
    }
}
