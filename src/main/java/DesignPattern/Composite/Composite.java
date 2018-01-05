package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends AbstractComponent {

    private List<AbstractComponent> components = null;

    public Composite(String name){
        super(name);
        this.components = new ArrayList<>();
    }

    @Override
    public void add(AbstractComponent component) {
        this.components.add(component);
    }

    @Override
    public void remove(AbstractComponent component) {
        this.components.remove(component);
    }

    @Override
    public void display(int depth) {
        String line = "";
        for(int i = 0; i < depth; i++) line += "-";
        System.out.println(line + this.name);

        for(AbstractComponent abstractComponent : this.components){
            abstractComponent.display(depth + 2);
        }
    }
}
