package Polymorphism.Practice;

public class PracticeMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();

        //两种方法创建USB鼠标，使用多态或不使用多态向上转型
        Mouse mouse = new Mouse();
        USB usb = mouse;//USB usb = new USB();
        laptop.useDevice(usb);

        //创建USB键盘，没有使用多态写法
        Keyboard keyboard = new Keyboard();
        //直接传参不报错，方法参数是USB类型，传递进去是实现类对象
        laptop.useDevice(keyboard);
        //使用匿名对象也是正确写法
        laptop.useDevice(new Keyboard());

        laptop.powerOff();
    }
}
