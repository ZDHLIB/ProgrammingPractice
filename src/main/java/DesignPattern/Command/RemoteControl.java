package DesignPattern.Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandList;

    public RemoteControl(){
        this.commandList = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commandList.add(command);
    }

    public void cancelCommand(Command command){
        this.commandList.remove(command);
    }

    public void pressButton(){
        for(Command command : commandList) {
            command.execute();
        }
    }
}
