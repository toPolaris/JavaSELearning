package Final;

public final class FinalClass {
    private final String name/* = "Susan"*/;//方法1
    //内容无影响
    private final String str = "Final Class!";

    public FinalClass() {
        name = "Susan";//方法2
    }

    public FinalClass(String name) {
        this.name = name;
    }

    public void Method() {
        System.out.println(this.str);
    }

    public String getName() {
        return name;
    }

/*    public void setName(String name) {
        this.name = name;
    }*/
}
