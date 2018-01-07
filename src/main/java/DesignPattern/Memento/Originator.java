package DesignPattern.Memento;

public class Originator {
    private String state;

    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setState(this.state);
        return memento;
    }

    public void showState(){
        System.out.println(this.state);
    }

    public void setMememto(Memento mememto){
        this.state = mememto.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
