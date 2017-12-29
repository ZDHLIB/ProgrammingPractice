package DesignPattern.Prototype;

import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;

public class ModelPrototype implements Cloneable{
    private double height;
    private double width;
    private IShape shape;
    private IColor color;

    @Override
    public ModelPrototype clone() throws CloneNotSupportedException {
        return (ModelPrototype) super.clone();  //Shadow copy
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public IShape getShape() {
        return shape;
    }

    public void setShape(IShape shape) {
        this.shape = shape;
    }

    public IColor getColor() {
        return color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }
}
