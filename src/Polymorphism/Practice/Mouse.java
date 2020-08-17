package Polymorphism.Practice;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("Open Mouse!");
    }

    @Override
    public void close() {
        System.out.println("Close Mouse!");
    }

    public void click() {
        System.out.println("Click On!");
    }
}
