package DesignPattern.AbstractFactry;

import DesignPattern.Service.Circle;
import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;
import DesignPattern.Service.RedColor;

public class ACompanyModelFactory implements IModelFactory {
    @Override
    public IShape createShape() {
        return new Circle();
    }

    @Override
    public IColor createColor() {
        return new RedColor();
    }
}
