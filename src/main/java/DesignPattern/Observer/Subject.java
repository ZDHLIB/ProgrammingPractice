package DesignPattern.Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    protected String subjectState;
    private Set<Observer> observerList = new HashSet<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObserver(){
        for(Observer obs : observerList){
            obs.update(subjectState);
        }
    }
}
