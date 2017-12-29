package DesignPattern.AbstractFactry;

import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;

public interface IModelFactory {
    public IShape createShape();
    public IColor createColor();
}
