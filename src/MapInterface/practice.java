package MapInterface;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 练习：计算输入字符串中每个字符出现次数
 * */
public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!dict.containsKey(c)) {
                dict.put(c, 1);
            } else {
                Integer num = dict.get(c);
                dict.put(c, ++num);
            }
        }
        System.out.println(dict);
    }
}
