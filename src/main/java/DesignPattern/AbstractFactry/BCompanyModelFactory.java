package DesignPattern.AbstractFactry;

import DesignPattern.Service.GreenColor;
import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;
import DesignPattern.Service.Rectangle;

public class BCompanyModelFactory implements IModelFactory {
    @Override
    public IShape createShape() {
        return new Rectangle();
    }

    @Override
    public IColor createColor() {
        return new GreenColor();
    }
}
