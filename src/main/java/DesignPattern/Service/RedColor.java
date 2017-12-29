package DesignPattern.Service;

import java.io.Serializable;

public class RedColor implements Serializable, IColor {
    @Override
    public void printColor() {
        System.out.println("Red color.");
    }
}
