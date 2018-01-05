package DesignPattern.Flyweight;

public class ConcreteWbeSite extends AbstractWebSite {
    private String name;
    public ConcreteWbeSite(String name){
        this.name = name;
    }

    @Override
    public void Use(User user) {
        System.out.println("WebSite's name: "+this.name+", User is: "+user.getName());
    }
}
