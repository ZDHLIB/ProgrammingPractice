package DesignPattern.Proxy;

public class RealImage implements Image {
    private String imgName;

    public RealImage(String imgName){
        this.imgName = imgName;
        loadFromDisk(imgName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + this.imgName);
    }

    private void loadFromDisk(String imgName){
        System.out.println("Loading " + imgName);
    }
}
