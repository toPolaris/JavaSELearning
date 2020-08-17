package Polymorphism;

public class Child extends Father {
    String str = "Child";

    @Override
    public void Method() {
        System.out.println("Method of Child!");
    }

    public void MethodChild() {
        System.out.println("In Child Only!");
    }
}
