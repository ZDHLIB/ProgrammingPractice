package DesignPattern.Strategy;

public class ContextStrategy {
    Strategy strategy;

    public ContextStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void action(){
        this.strategy.algorithm();
    }
}
