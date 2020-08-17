package IO;

import java.io.*;
import java.util.ArrayList;

/**
 * learning.IO
 * Created on 2020/8/1 19:34
 *
 * @author Protein
 */
public class Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\IO\\test06.txt"));
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Susan", 18, 1));
        people.add(new Person("Tom", 17, 9));
        people.add(new Person("Rose", 20, 5));
        /**
         * 序列化的文件是一个整体，序列化与还原序列化的时候会把所有的文件里所有被序列化的对象全部序列化和读取出来
         * */
        //void writeObject(Object obj)：将指定的对象写入ObjectOutputStream。
        oos.writeObject(people);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\IO\\test06.txt"));
        /**Object readObject()从ObjectInputStream读取对象。
         * readObject方法声明抛出了ClassNotFoundException(class文件找不到异常)，当不存在对象的class文件时抛出此异常
         * 反序列化的前提：类必须实现Serializable，必须存在类对应的class文件
         * */
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }
}
