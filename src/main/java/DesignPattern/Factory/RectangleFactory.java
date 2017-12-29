package DesignPattern.Factory;

import DesignPattern.Service.IShape;
import DesignPattern.Service.Rectangle;

public class RectangleFactory implements IFactory {
    @Override
    public IShape createShape() {
        return new Rectangle();
    }
}
