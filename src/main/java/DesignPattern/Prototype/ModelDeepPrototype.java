package DesignPattern.Prototype;

import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;

import java.io.*;

public class ModelDeepPrototype implements Serializable, Cloneable {
    private double height;
    private double width;
    private IShape shape;
    private IColor color;

    @Override
    public ModelDeepPrototype clone() throws CloneNotSupportedException {
        ModelDeepPrototype newInstance = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            byte[] newData = bos.toByteArray();
            oos.close();
            bos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(newData);
            newInstance = (ModelDeepPrototype) new ObjectInputStream(bais).readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newInstance;
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
