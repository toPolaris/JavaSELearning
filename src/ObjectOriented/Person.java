package ObjectOriented;

/*
 * private：本类中可以随意访问该变量，其他类无法直接访问；间接访问变量必须设定getter、setter方法
 *   getter：不能有参数，返回值类型与成员变量一致，方法命名规则-getXxx
 *           如果类型是boolean，则命名规则修改为isXxx
 *   setter：不能有返回值，参数类型与成员变量一致，方法命名规则-SetXxx
 * this：当方法局部变量与类的成员变量重名时，根据“就近原则”，优先使用局部变量
 *       如果需要访问本类当中的成员变量，需要使用：this.成员变量名
 *       谁调用的方法，谁就是this
 * */
public class Person {
    String name;
    private int age;
    private boolean male;

    public Person() {
    }

    public Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    //获取age数据
    public int getAge() {
        return age;
    }

    //向age设定数据，手动编写
    public void setAge(int num) {
        if (num > 0 && num < 120) {
            age = num;
        }
        System.out.println("Error!");
    }

    //boolean类型变量使用isXxx
    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("Hello, " + name + "I'm " + this.name);
    }
}
