package DesignPattern.State;

public class OpenState extends State {
    @Override
    public void action(Context context) {
        System.out.println("Current is open state, now change to close state.");
        context.setState(new CloseState());
    }
}
