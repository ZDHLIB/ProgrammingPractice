package DesignPattern.Composite;

public class LeafComponent extends AbstractComponent {
    public LeafComponent(String name){
        super(name);
    }

    @Override
    public void add(AbstractComponent component) {
        System.out.println("Leaf has no children.");
    }

    @Override
    public void remove(AbstractComponent component) {
        System.out.println("Leaf has no children.");
    }

    @Override
    public void display(int depth) {
        String line = "";
        for(int i = 0; i < depth; i++) line += "-";
        System.out.println(line + this.name);
    }
}
