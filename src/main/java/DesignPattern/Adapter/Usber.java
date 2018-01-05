package DesignPattern.Adapter;

public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("Is USB");
    }
}
