package ExceptionClass;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 17:33
 * Description: a custom exception instance
 */
public class RegisterException extends Exception {
    public RegisterException() {//空参构造
    }

    public RegisterException(String message) {//message表示异常提示
        super(message);
    }
}
