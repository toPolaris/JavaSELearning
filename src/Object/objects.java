package Object;

import java.util.Objects;

public class objects {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "null";

        //equals方法源码，防止空指针异常
        /*public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
        }*/
        Objects.equals(str1, str2);

    }
}
