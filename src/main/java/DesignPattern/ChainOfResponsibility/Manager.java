package DesignPattern.ChainOfResponsibility;

public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void requestApp(Request request) throws IllegalAccessException;
}