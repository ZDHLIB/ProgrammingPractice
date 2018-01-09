package DesignPattern.Template;

public abstract class AbstractTemplate {
    protected abstract void operation1();
    protected abstract void operation2();

    public void templateAction(){
        System.out.println("Start operation 1...");
        operation1();
        System.out.println("Start operation 2...");
        operation2();
    }
}
