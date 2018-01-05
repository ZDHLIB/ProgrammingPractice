package DesignPattern.Bridge;

import DesignPattern.Service.Circle;
import DesignPattern.Service.IColor;

public class CircleDraw extends AbstractDraw {

    public CircleDraw(IColor color){
        super(color);
    }

    @Override
    public void draw() {
        this.color.printColor();
    }
}
