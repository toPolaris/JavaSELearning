package Polymorphism.Practice;

/*
 * powerOn-开机
 * powerOff-关机
 * seDevice-使用USB设备
 * */
public class Laptop {
    public void powerOn() {
        System.out.println("Laptop Power On!");
    }

    public void powerOff() {
        System.out.println("Laptop Power Off!");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
