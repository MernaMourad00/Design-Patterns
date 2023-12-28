package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    List<Command> commands;

    public Invoker() {
        commands = new ArrayList<>();
    }

   public void addCommand(Command command){
        commands.add(command);

    }

    public void executeCommands(){
        for (Command command:commands){
            command.execute();
        }
    }

    public void executeSingleCommand(int index) {
        if (index >= 0 && index < commands.size()) {
            Command command = commands.get(index);
            command.execute();
        } else {
            System.out.println("Invalid command index.");
        }
    }

}
