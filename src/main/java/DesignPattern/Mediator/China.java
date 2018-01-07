package DesignPattern.Mediator;

public class China extends Country{
    public China(UnitedNation mediator) {
        super(mediator);
    }

    public void Declare(String msg){
        this.mediator.Declare(msg, this);
    }

    public void GetMessage(String msg){
        System.out.println("China knows : " + msg);
    }
}
