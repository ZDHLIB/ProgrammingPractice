package DesignPattern.Command;

public class LightOffCommand implements Command {
    private LightControl lightControl;

    public LightOffCommand(LightControl lightControl){
        this.lightControl = lightControl;
    }

    @Override
    public void execute() {
        this.lightControl.switchOff();
    }
}
