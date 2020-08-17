package File;

import java.io.File;
import java.io.IOException;

/**
 * learning.File
 * Created by Protein on 2020/7/29 18:16
 * Description:
 */

public class definition_usage {
    public static void main(String[] args) throws IOException {
        /*
         * 构造方法：
         *   public File(String pathname)：通过将给定的路径名字符串转换为抽象路径名来创建新的File实例。
         *   public File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的File实例。
         *   public File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的 File实例。
         * */
        String pathname01 = "C:\\Users\\Protein\\IdeaProjects\\learning\\src\\File\\a.txt";
        File file01 = new File(pathname01);

        String pPath = "C:\\Users\\Protein\\IdeaProjects\\learning\\src\\File";
        String cPath = "b.txt";
        File file02 = new File(pPath, cPath);

        File pDir = new File(pPath);
        File file03 = new File(pDir, cPath);

        /*
         * 常用方法：
         *   public String getAbsolutePath()：返回此File的绝对路径名字符串。
         *   public String getPath()：将此File构造路径转换为字符串。
         *   public String getName()：返回由此File表示的文件或目录的名称。
         *   public long length()：返回由此File表示的文件的长度，以字节计算。
         * */
        File file04 = new File("C:\\Users\\Protein\\IdeaProjects\\learning\\src\\File\\c.txt");
        //C:\Users\Protein\IdeaProjects\learning\src\File\c.txt
        System.out.println(file04.getAbsolutePath());
        //C:\Users\Protein\IdeaProjects\learning\src\File\c.txt
        System.out.println(file04.getPath());
        //c.txt
        System.out.println(file04.getName());
        //66
        System.out.println(file04.length());
        /*
         * 绝对路径：从盘符开始的完整路径。
         * 相对路径：相对于项目目录的简略路径，开发中使用较多。
         * */
        //file05与file06使用的是同一文件
        File file05 = new File("JavaSE_Learning.iml");
        File file06 = new File("C:\\Users\\Protein\\IdeaProjects\\learning\\JavaSE_Learning.iml");
        //JavaSE_Learning.iml --> 433
        System.out.println(file05.getName() + " --> " + file05.length());
        //JavaSE_Learning.iml --> 433
        System.out.println(file06.getName() + " --> " + file06.length());
        /*
         * 用于判断的方法：
         *   public boolean exists()：此File表示的文件或目录是否实际存在。
         *   public boolean isDirectory()：此File表示的是否为目录。
         *   public boolean isFile()：此File表示的是否为文件。
         * */
        //true
        System.out.println(file01.exists());
        //false
        System.out.println(file02.isDirectory());
        //true
        System.out.println(file03.isFile());
        /*
         * 创建删除功能的方法：
         *   public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件，返回值为是否创建
         *   public boolean delete()：删除由此File表示的文件或目录。
         *   public boolean mkdir()：创建由此File表示的目录。
         *   public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录。
         * */
        //false
        System.out.println(file01.createNewFile());
        File file07 = new File(pDir, "d.txt");
        //false
        System.out.println(file07.exists());
        //true
        System.out.println(file07.createNewFile());
        //true
        System.out.println(file07.exists());
        //true
        System.out.println(file07.delete());

        File file08 = new File("src\\File\\new\\new_in_new");
        //false
        System.out.println(file08.exists());
        //false
        System.out.println(file08.mkdir());
        //true
        System.out.println(file08.mkdirs());
        //true
        System.out.println(file08.exists());
        /*
         * 目录的遍历：
         *   public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录。
         *   public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录。
         * */
        File file09 = new File("src\\File");
        String[] filenames = file09.list();
        if (filenames != null) {
            //输出文件及文件夹
            for (String filename : filenames) {
                System.out.println(filename);
            }
        }
        File[] files = file09.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }
        /*
         * 上面的遍历带来的问题是无法遍历到子文件夹内的文件，现在使用递归遍历所有文件
         * */
        printDir(file09);
    }

    public static void printDir(File f) {
        File[] files = f.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getPath());
                } else {
                    System.out.println(file.getAbsolutePath());
                    printDir(file);
                }
            }
        }
    }
}