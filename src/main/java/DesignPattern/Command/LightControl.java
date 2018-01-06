package DesignPattern.Command;

public class LightControl {
    private boolean status;
    public void switchOn(){
        status = true;
        System.out.println("Light on.");
    }
    public void switchOff(){
        status = false;
        System.out.println("Light off.");
    }
}
