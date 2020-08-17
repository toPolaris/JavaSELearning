package Object;

import java.util.Objects;

public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    //手动重写equals
    @Override
    public boolean equals(Object obj) {
        if (obj != null){//小优化：如果obj为null直接返回false
            if (obj == this){//小优化：传参为本身直接返回true
                return true;
            }
            if (obj instanceof Person){//判断能否强转
                Person person = (Person) obj;//向下强制转型
                return this.name.equals(person.name) && this.age == person.age;
            }
        }
        return false;
    }*/

    //自动重写equals，alt+insert
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //这里使用反射判断o是否为Person，之后学习
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
