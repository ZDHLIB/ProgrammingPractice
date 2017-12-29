package DesignPattern.Factory;

import DesignPattern.Service.Circle;
import DesignPattern.Service.IShape;

public class CircleFactory implements IFactory{
    @Override
    public IShape createShape() {
        return new Circle();
    }
}
