package DesignPattern.Visitor;

public class ConcreteVisitorB extends AbstractVisitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(concreteElementA.getClass() + "is visited by" + this.getClass());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(concreteElementB.getClass() + "is visited by" + this.getClass());
    }
}
