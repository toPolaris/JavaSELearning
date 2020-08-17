package Polymorphism.Practice;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("Open Keyboard!");
    }

    @Override
    public void close() {
        System.out.println("Close Keyboard!");
    }

    public void type() {
        System.out.println("Type In!");
    }
}
