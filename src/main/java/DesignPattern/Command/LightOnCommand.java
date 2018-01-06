package DesignPattern.Command;

public class LightOnCommand implements Command {

    private LightControl lightControl;

    public LightOnCommand(LightControl lightControl){
        this.lightControl = lightControl;
    }

    @Override
    public void execute() {
        this.lightControl.switchOn();
    }
}
