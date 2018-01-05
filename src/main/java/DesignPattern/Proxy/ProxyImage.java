package DesignPattern.Proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String imgName;

    public ProxyImage(String imgName){
        this.imgName = imgName;
    }

    @Override
    public void display() {
        if(this.realImage == null){
            this.realImage = new RealImage(this.imgName);
        }
        this.realImage.display();
    }
}
