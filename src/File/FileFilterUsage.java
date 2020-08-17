package File;

/**
 * learning.File
 * Created on 2020/7/29 19:48
 *
 * @author Protein
 */

import java.io.File;

/**
 * java.io.FileFilter是一个接口——File的过滤器。
 * 该接口的对象可以传递给File类的listFiles(FileFilter)作为参数，接口中只有一个方法。
 * boolean accept(File pathname)：测试pathname是否应该包含在当前File目录中，符合则返回true。
 */

/**
 * 在File类中有两个ListFiles重载的方法，方法的参数传递的就是过滤器
 * ·File[] listFiles(FileFilter filter)
 * java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器。
 * 用来过滤文件（File对象）
 * 抽象方法：boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中。
 * 参数：File pathname是使用ListFiles方法遍历目录得到的文件对象
 * ·File[] listFiles(FilenameFilter filter)
 * java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名。
 * 用于过滤文件名称
 * 抽象方法：boolean accept(File dir, String name) 测试指定文件是否应该包含在某一文件列表中。
 * 参数：File dir是构造方法中传递的被遍历的目录；String name是使用ListFiles方法遍历目录获取的每一个文件/文件夹的名称
 * 注意：两个过滤器接口是没有实现类的,需要我们自己写实现类,重写过滤的方法accept,在方法中自己定义过滤的规则
 */
public class FileFilterUsage {
    public static void main(String[] args) {
        File f = new File("src//File");
        method01(f);
        //该接口只有一个抽象方法考虑使用Lambda表达式优化
        method02(f);
    }

    private static void method01(File file) {
        File[] files = file.listFiles(new FileFilterImpl());
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    method01(f);
                } else {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }

    private static void method02(File file) {
        File[] files = file.listFiles(pathname -> pathname.isDirectory() || pathname.getName().endsWith(".txt"));
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    method02(f);
                } else {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
