package DesignPattern.Visitor;

public class ConcreteElementB extends AbstractElement {
    @Override
    public void accept(AbstractVisitor visitor){
        visitor.visitConcreteElementB(this);
    }
}
