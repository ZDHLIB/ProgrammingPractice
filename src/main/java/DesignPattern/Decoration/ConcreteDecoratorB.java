package DesignPattern.Decoration;

public class ConcreteDecoratorB extends AbstractDecorator {
    public ConcreteDecoratorB(AbstractComponent2 component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Decorate B1");
        super.operation();
        System.out.println("Decorate B2");
    }
}
