package DesignPattern.Visitor;

public abstract class AbstractElement {
    public abstract void accept(AbstractVisitor visitor);
}
