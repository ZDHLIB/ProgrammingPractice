package DesignPattern.Template;

public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    public void operation1() {
        System.out.println("ConcreteTemplateA opr1.");
    }

    @Override
    public void operation2() {
        System.out.println("ConcreteTemplateA opr2.");
    }
}
