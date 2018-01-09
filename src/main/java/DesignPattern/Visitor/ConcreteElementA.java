package DesignPattern.Visitor;

public class ConcreteElementA extends AbstractElement {
    @Override
    public void accept(AbstractVisitor visitor){
        visitor.visitConcreteElementA(this);
    }
}
