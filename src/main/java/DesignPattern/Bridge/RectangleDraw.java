package DesignPattern.Bridge;

import DesignPattern.Service.IColor;

public class RectangleDraw extends AbstractDraw {

    public RectangleDraw(IColor color){
        super(color);
    }

    @Override
    public void draw() {
        this.color.printColor();
    }
}
