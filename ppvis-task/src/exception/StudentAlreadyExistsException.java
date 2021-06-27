package exception;

public class StudentAlreadyExistsException extends Exception {
    public StudentAlreadyExistsException() {
        super();
    }

    public StudentAlreadyExistsException(String message) {
        super(message);
    }

    public StudentAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    protected StudentAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public StudentAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
