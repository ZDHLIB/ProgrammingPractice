package DesignPattern.Service;

import java.io.Serializable;

public class Rectangle implements Serializable, IShape{
    @Override
    public void printShape() {
        System.out.println("Create Rectangle.");
    }
}
