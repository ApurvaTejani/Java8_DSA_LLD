package ExceptionHandling.UserDefinedException;

public class NotValidAgeException extends Exception {
    public NotValidAgeException(String message) {
        super(message);
    }
}
