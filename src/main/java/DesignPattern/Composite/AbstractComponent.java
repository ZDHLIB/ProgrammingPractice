package DesignPattern.Composite;

public abstract class AbstractComponent {
    protected String name;

    public AbstractComponent(String name){
        this.name = name;
    }

    public abstract void add(AbstractComponent component);
    public abstract void remove(AbstractComponent component);
    public abstract void display(int depth);
}
