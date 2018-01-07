package DesignPattern.Mediator;

public class USA extends Country{
    public USA(UnitedNation mediator) {
        super(mediator);
    }

    public void Declare(String msg){
        this.mediator.Declare(msg, this);
    }

    public void GetMessage(String msg){
        System.out.println("America knows : " + msg);
    }
}
