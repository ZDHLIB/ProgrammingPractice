package DesignPattern.Service;

import java.io.Serializable;

public class Circle implements Serializable, IShape {
    @Override
    public void printShape() {
        System.out.println("Create Circle.");
    }
}
