package DesignPattern.State;

public class CloseState extends State {
    @Override
    public void action(Context context) {
        System.out.println("Current is close state, now change to open state.");
        context.setState(new OpenState());
    }
}
