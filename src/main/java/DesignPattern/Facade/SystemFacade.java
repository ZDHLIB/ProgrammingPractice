package DesignPattern.Facade;

public class SystemFacade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public SystemFacade(){
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
    }

    public void ModelA(){
        System.out.println("Call model A:");
        this.subSystemTwo.methodTwo();
        this.subSystemOne.methodOne();
    }

    public void ModelB(){
        System.out.println("Call model B:");
        this.subSystemTwo.methodTwo();
        this.subSystemOne.methodOne();
        this.subSystemThree.methodThree();
        this.subSystemTwo.methodTwo();
    }
}
