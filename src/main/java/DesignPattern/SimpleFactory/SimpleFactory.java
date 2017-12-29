package DesignPattern.SimpleFactory;

import DesignPattern.Service.Circle;
import DesignPattern.Service.IShape;
import DesignPattern.Service.Rectangle;

public class SimpleFactory {
    public static IShape createShape(String opr){
        IShape shape = null;
        switch(opr){
            case "circle":
                shape = new Circle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
        }
        return shape;
    }

}
