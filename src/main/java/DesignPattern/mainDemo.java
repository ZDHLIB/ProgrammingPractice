package DesignPattern;

import DesignPattern.AbstractFactry.ACompanyModelFactory;
import DesignPattern.AbstractFactry.BCompanyModelFactory;
import DesignPattern.AbstractFactry.IModelFactory;
import DesignPattern.Adapter.Ps2;
import DesignPattern.Adapter.Ps2Adapter;
import DesignPattern.Bridge.AbstractDraw;
import DesignPattern.Bridge.CircleDraw;
import DesignPattern.Bridge.RectangleDraw;
import DesignPattern.ChainOfResponsibility.*;
import DesignPattern.Command.*;
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
import DesignPattern.Interpreter.AndExpression;
import DesignPattern.Interpreter.IExpression;
import DesignPattern.Interpreter.OrExpression;
import DesignPattern.Interpreter.TerminalExpression;
import DesignPattern.Mediator.*;
import DesignPattern.Memento.Caretaker;
import DesignPattern.Memento.Memento;
import DesignPattern.Memento.Originator;
import DesignPattern.Observer.ConcreteObserver;
import DesignPattern.Observer.ConcreteSubject;
import DesignPattern.Prototype.ModelDeepPrototype;
import DesignPattern.Prototype.ModelPrototype;
import DesignPattern.Proxy.Image;
import DesignPattern.Proxy.ProxyImage;
import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;
import DesignPattern.SimpleFactory.SimpleFactory;
import DesignPattern.State.CloseState;
import DesignPattern.State.Context;
import DesignPattern.Strategy.ConcreteStrategyA;
import DesignPattern.Strategy.ConcreteStrategyB;
import DesignPattern.Strategy.ConcreteStrategyC;
import DesignPattern.Strategy.ContextStrategy;
import DesignPattern.Template.AbstractTemplate;
import DesignPattern.Template.ConcreteTemplateA;
import DesignPattern.Template.ConcreteTemplateB;
import DesignPattern.Visitor.*;


public class mainDemo {

    public static void main(String[] orgs) throws CloneNotSupportedException, IllegalAccessException {
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

        //Chain of Responsibility
        Manager commManager = new CommonManager("CommManager");
        Manager Majordomo = new Majordomo("Majordomo");
        Manager GeneManager = new GeneralManager("GeneralManager");
        commManager.setSuperior(Majordomo);
        Majordomo.setSuperior(GeneManager);
        
        Request request = new Request();
        request.setReqType("Leave");
        for(int i = 1; i < 7; i++){
            request.setNum(i);
            commManager.requestApp(request);
        }

        //Command
        RemoteControl control = new RemoteControl();
        LightControl lightControl = new LightControl();
        Command lightsOn1 = new LightOnCommand(lightControl);
        Command lightsOff1 = new LightOffCommand(lightControl);
        Command lightsOn2 = new LightOnCommand(lightControl);
        Command lightsOff2 = new LightOffCommand(lightControl);

        control.addCommand(lightsOn1);
        control.addCommand(lightsOff1);
        control.addCommand(lightsOn2);
        control.cancelCommand(lightsOn1);
        control.addCommand(lightsOff2);

        control.pressButton();

        //Interpreter
        IExpression robert = new TerminalExpression("Robert");
        IExpression john = new TerminalExpression("John");
        IExpression isMale = new OrExpression(robert, john);

        IExpression julie = new TerminalExpression("Julie");
        IExpression married = new TerminalExpression("Married");
        IExpression isMarriedWoman = new AndExpression(julie, married);

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));


        //Mediator
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();
        China china = new China(UNSC);
        USA usa = new USA(UNSC);
        UNSC.setCountryUSA(usa);
        UNSC.setCountryChina(china);

        china.Declare("I am China");
        usa.Declare("I am Amarica");

        //Memento
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("1");
        originator.showState();
        Memento memento = originator.createMemento();
        caretaker.setMemento(memento);

        originator.setState("2");
        originator.showState();

        originator.setMememto(memento);
        originator.showState();

        //Observer
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(new ConcreteObserver("Obs_A"));
        concreteSubject.addObserver(new ConcreteObserver("Obs.B"));

        concreteSubject.setSubjectState("1");
        concreteSubject.notifyObserver();
        concreteSubject.setSubjectState("2");
        concreteSubject.notifyObserver();

        //State
        Context context = new Context(new CloseState());
        context.changeState();
        context.changeState();

        //Strategy
        ContextStrategy contextStrategy = new ContextStrategy(new ConcreteStrategyA());
        contextStrategy.action();
        contextStrategy = new ContextStrategy(new ConcreteStrategyB());
        contextStrategy.action();
        contextStrategy = new ContextStrategy(new ConcreteStrategyC());
        contextStrategy.action();

        //Template
        AbstractTemplate template;
        template = new ConcreteTemplateA();
        template.templateAction();
        template = new ConcreteTemplateB();
        template.templateAction();

        //Visitor
        ObjectStructure objectStructure = new ObjectStructure();
        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());

        objectStructure.accept(concreteVisitorA);
        objectStructure.accept(concreteVisitorB);
    }
}
