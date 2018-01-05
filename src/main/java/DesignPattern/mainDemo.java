package DesignPattern;

import DesignPattern.AbstractFactry.ACompanyModelFactory;
import DesignPattern.AbstractFactry.BCompanyModelFactory;
import DesignPattern.AbstractFactry.IModelFactory;
import DesignPattern.Adapter.Ps2;
import DesignPattern.Adapter.Ps2Adapter;
import DesignPattern.Bridge.AbstractDraw;
import DesignPattern.Bridge.CircleDraw;
import DesignPattern.Bridge.RectangleDraw;
import DesignPattern.Composite.AbstractComponent;
import DesignPattern.Composite.Composite;
import DesignPattern.Composite.LeafComponent;
import DesignPattern.Decoration.*;
import DesignPattern.Facade.SystemFacade;
import DesignPattern.Factory.CircleFactory;
import DesignPattern.Factory.IFactory;
import DesignPattern.Flyweight.AbstractWebSite;
import DesignPattern.Flyweight.User;
import DesignPattern.Flyweight.WebSiteFactory;
import DesignPattern.Prototype.ModelDeepPrototype;
import DesignPattern.Prototype.ModelPrototype;
import DesignPattern.Proxy.Image;
import DesignPattern.Proxy.ProxyImage;
import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;
import DesignPattern.SimpleFactory.SimpleFactory;


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

        //Adapter
        Ps2 ps2 = new Ps2Adapter();
        ps2.isPs2();

        //Bridge
        AbstractDraw abstractDraw = new CircleDraw(colorA);
        AbstractDraw abstractDraw1 = new RectangleDraw(colorB);
        abstractDraw.draw();
        abstractDraw1.draw();

        //Composite
        AbstractComponent root = new Composite("Root");
        root.add(new LeafComponent("Leaf A"));
        root.add(new LeafComponent("Leaf B"));

        AbstractComponent subComp = new Composite("SubComp1");
        subComp.add(new LeafComponent("Leaf SC1_Leaf A"));
        subComp.add(new LeafComponent("Leaf SC1_Leaf B"));

        AbstractComponent subComp2 = new Composite("SubComp2");
        subComp2.add(new LeafComponent("Leaf SC2_Leaf A"));
        subComp2.add(new LeafComponent("Leaf SC2_Leaf B"));
        subComp.add(subComp2);

        subComp.add(new LeafComponent("Leaf SC1_Leaf C"));
        subComp.add(new LeafComponent("Leaf SC1_Leaf D"));

        root.add(subComp);

        root.display(1);

        //Decoration
        AbstractComponent2 component = new ConcreteComponent2();
        AbstractDecorator decorator1 = new ConcreteDecoratorA(component);
        AbstractDecorator decorator2 = new ConcreteDecoratorB(component);
        decorator1.operation();
        decorator2.operation();

        //Facade
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.ModelA();
        systemFacade.ModelB();

        //Flyweight
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        AbstractWebSite webSiteA1 = webSiteFactory.getWebSite("A");
        webSiteA1.Use(new User("AA1"));
        AbstractWebSite webSiteA2 = webSiteFactory.getWebSite("A");
        webSiteA2.Use(new User("AA2"));
        System.out.println("The NO of WebSite: " + webSiteFactory.getWebSiteNO());

        //Proxy
        Image img = new ProxyImage("Image A");
        img.display();
        img.display();

    }
}
