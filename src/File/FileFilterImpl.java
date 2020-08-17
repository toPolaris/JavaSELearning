package File;

import java.io.File;
import java.io.FileFilter;

/**
 * learning.File
 * Created on 2020/7/29 19:56
 *
 * @author Protein
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            //文件则不过滤，一律返回true
            return true;
        } else {
            //判断文件是否以".txt"结尾
            return pathname.getName().endsWith(".txt");
        }
    }
}
