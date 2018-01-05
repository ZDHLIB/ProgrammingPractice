package DesignPattern.Decoration;

public abstract class AbstractDecorator extends AbstractComponent2 {
    protected AbstractComponent2 component;

    public AbstractDecorator(AbstractComponent2 component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(this.component != null){
            this.component.operation();
        }
    }
}
