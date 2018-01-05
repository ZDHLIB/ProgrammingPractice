package DesignPattern.Decoration;

public class ConcreteDecoratorA extends AbstractDecorator {
    public ConcreteDecoratorA(AbstractComponent2 component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Decorate A1");
        super.operation();
        System.out.println("Decorate A2");
    }
}
