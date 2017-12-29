package DesignPattern;

import DesignPattern.AbstractFactry.ACompanyModelFactory;
import DesignPattern.AbstractFactry.BCompanyModelFactory;
import DesignPattern.AbstractFactry.IModelFactory;
import DesignPattern.Factory.CircleFactory;
import DesignPattern.Factory.IFactory;
import DesignPattern.Prototype.ModelDeepPrototype;
import DesignPattern.Prototype.ModelPrototype;
import DesignPattern.Service.IColor;
import DesignPattern.SimpleFactory.SimpleFactory;
import DesignPattern.Service.IShape;
import DesignPattern.Singleton.Singleton;

public class mainDemo {

    public static void main(String[] orgs) throws CloneNotSupportedException {
        //Simple factory
        IShape shape = SimpleFactory.createShape("circle");
        shape.printShape();

        //Factory
        IFactory shapeFactory = new CircleFactory();
        IShape shape2 = shapeFactory.createShape();
        shape2.printShape();

        //AbstractFactory
        IModelFactory modelFactoryA = new ACompanyModelFactory();
        IModelFactory modelFactoryB = new BCompanyModelFactory();

        IShape shapeA = modelFactoryA.createShape();
        IColor colorA = modelFactoryA.createColor();
        IShape shapeB = modelFactoryB.createShape();
        IColor colorB = modelFactoryB.createColor();

        shapeA.printShape();
        colorA.printColor();
        shapeB.printShape();
        colorB.printColor();

        //Prototype
        ModelDeepPrototype modelDeepPrototype = new ModelDeepPrototype();
        modelDeepPrototype.setColor(colorA);
        modelDeepPrototype.setShape(shapeA);
        modelDeepPrototype.setHeight(100);
        modelDeepPrototype.setWidth(50);
        ModelDeepPrototype modelDeepPrototype2 = modelDeepPrototype.clone();
        System.out.println(modelDeepPrototype.getShape());
        System.out.println(modelDeepPrototype2.getShape());

        ModelPrototype modelPrototype = new ModelPrototype();
        modelPrototype.setColor(colorA);
        modelPrototype.setShape(shapeA);
        modelPrototype.setHeight(100);
        modelPrototype.setWidth(50);
        ModelPrototype modelPrototype2 = modelPrototype.clone();
        System.out.println(modelPrototype.getShape());
        System.out.println(modelPrototype2.getShape());

    }
}
