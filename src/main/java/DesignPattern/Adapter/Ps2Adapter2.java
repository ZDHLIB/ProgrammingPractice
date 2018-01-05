package DesignPattern.Adapter;

//Object adapter. Enable Ps2 interface to use Usb interface
public class Ps2Adapter2 implements Ps2 {

    private Usb usb;

    public Ps2Adapter2(Usb usb){
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        this.usb.isUsb();
    }
}
