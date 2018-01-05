package DesignPattern.Bridge;

import DesignPattern.Service.IColor;

public abstract class AbstractDraw {
    protected IColor color = null;

    protected AbstractDraw(IColor color){
        this.color = color;
    }

    public abstract void draw();
}
