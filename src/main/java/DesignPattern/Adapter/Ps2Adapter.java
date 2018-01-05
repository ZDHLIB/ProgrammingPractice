package DesignPattern.Adapter;

//CLass adapter. Enable Ps2 interface to use Usb interface
public class Ps2Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
