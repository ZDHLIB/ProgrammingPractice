package DesignPattern.Flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, AbstractWebSite> flyweight = new HashMap<>();

    public AbstractWebSite getWebSite(String name){
        if(!flyweight.containsKey(name)){
            flyweight.put(name, new ConcreteWbeSite(name));
        }
        return flyweight.get(name);
    }

    public int getWebSiteNO(){
        return flyweight.size();
    }
}
