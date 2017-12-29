package DesignPattern.Builder;

import DesignPattern.Service.IColor;
import DesignPattern.Service.IShape;
import DesignPattern.Service.Model;

public class ModelBuilder {
    private Model model = null;

    public ModelBuilder(){
        this.model = new Model();
    }

    public ModelBuilder buildHeight(double h){
        this.model.setHeight(h);
        return this;
    }

    public ModelBuilder buildWidth(double w){
        this.model.setWidth(w);
        return this;
    }

    public ModelBuilder buildColor(IColor color){
        this.model.setColor(color);
        return this;
    }

    public ModelBuilder buildShape(IShape shape){
        this.model.setShape(shape);
        return this;
    }

    public Model build(){
        return this.model;
    }
}
