package DesignPattern.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<AbstractElement> elements = new ArrayList<>();

    //添加元素
    public void addElement(AbstractElement element){
        elements.add(element);
    }

    //移除元素
    public void removeElement(AbstractElement element){
        elements.remove(element);
    }

    //元素接受访问者访问
    public void accept(AbstractVisitor visitor){
        for (AbstractElement e : elements) {
            e.accept(visitor);
        }
    }

}
