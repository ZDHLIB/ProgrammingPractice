package DesignPattern.Template;

public class ConcreteTemplateB extends AbstractTemplate {
    @Override
    public void operation1() {
        System.out.println("ConcreteTemplateB opr1.");
    }

    @Override
    public void operation2() {
        System.out.println("ConcreteTemplateB opr2.");
    }
}
