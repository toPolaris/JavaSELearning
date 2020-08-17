package ExceptionClass;

/**
 * learning.ExceptionClass
 * Created by Protein on 2020/7/25 17:45
 * Description: a runtime custom exception instance
 */
public class RuntimeRegisterException extends RuntimeException {
    public RuntimeRegisterException() {
    }

    public RuntimeRegisterException(String message) {
        super(message);
    }
}
