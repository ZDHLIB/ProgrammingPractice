package DesignPattern.Mediator;

public abstract class Country {
    protected UnitedNation mediator;

    public Country(UnitedNation mediator){
        this.mediator = mediator;
    }

    abstract public void GetMessage(String msg);
}
