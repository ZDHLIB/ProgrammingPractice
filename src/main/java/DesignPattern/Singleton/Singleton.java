package DesignPattern.Singleton;

import java.io.Serializable;

public final class Singleton implements Serializable {
    private static Singleton sc = null;

    private Singleton() {
        if(sc != null){
            throw new IllegalStateException("Already Created.");
        }
    }

    public static Singleton getInstance(){
        if(sc == null){
            synchronized(Singleton.class){
                if(sc == null){
                    sc = new Singleton();
                }
            }
        }
        return sc;
    }
}
