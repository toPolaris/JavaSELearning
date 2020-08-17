package ExceptionClass;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 13:34
 * Description: use "throw" to deal with an exception
 */
public class solution_throw {
    public static void main(String[] args) {
        /*
         * Java中提供了关键字throw用来抛出异常
         * throw用在方法内，用来抛出一个对象，将这个异常对象传递到调用者处，结束方法的执行
         * 格式：throw new ExceptionClassName(param);
         *   e.g. throw new NullPointerException("Array didn't exist!");
         * */
        int[] arr = {1, 2, 3};
        /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Overflow!
         *     at ExceptionClass.solution.getElem(solution.java:22)
         *     at ExceptionClass.solution.main(solution.java:17)
         * */
        System.out.println(getElem(arr, 3));
        /*
         * 之前提过Objects类是null-save的，其源码中对null进行了抛出异常的操作
         * public static <T> T requireNonNull(T obj) {
         *   if (obj == null)
         *       throw new NullPointerException();
         *   return obj;
         * }
         * */
    }

    public static int getElem(int[] array, int i) {
        if (i < 0 || i > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Overflow!");
        }
        return array[i];
    }
}
