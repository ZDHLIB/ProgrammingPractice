package DesignPattern.Observer;

public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;

    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String newState) {
        this.observerState = newState;
        System.out.println("Observer state is updated to: " + newState);
    }
}
