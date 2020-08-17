package ObjectOriented;

public class ObjectOriented06StandardClass {
    /*
     * 一个standard class包括：
     *   1.所有member variable都要使用private修饰
     *   2.所有member variable都有一对getter/setter方法
     *   3.编写一个无参Constructor
     *   4.编写一个全参Constructor
     * */
    private String param1;
    private int param2;
    private double param3;
    private boolean param4;

    public ObjectOriented06StandardClass() {
    }

    public ObjectOriented06StandardClass(String param1, int param2, double param3, boolean param4) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public double getParam3() {
        return param3;
    }

    public void setParam3(double param3) {
        this.param3 = param3;
    }

    public boolean isParam4() {
        return param4;
    }

    public void setParam4(boolean param4) {
        this.param4 = param4;
    }
}
