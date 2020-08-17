package File;

import java.io.File;

/**
 * learning.File
 * Created on 2020/7/29 19:38
 *
 * @author Protein
 */
public class SearchTxt {
    public static void main(String[] args) {
        File f = new File("src//File");
        searchTxt(f);
    }

    private static void searchTxt(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().endsWith(".txt")) {
                        System.out.println(f.getAbsolutePath());
                    }
                } else {
                    searchTxt(f);
                }
            }
        }
    }
}
