package DesignPattern.State;

public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public void changeState(){
        this.state.action(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
