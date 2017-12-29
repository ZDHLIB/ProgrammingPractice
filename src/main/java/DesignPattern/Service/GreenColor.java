package DesignPattern.Service;

import java.io.Serializable;

public class GreenColor implements Serializable, IColor {
    @Override
    public void printColor() {
        System.out.println("Green color.");
    }
}
