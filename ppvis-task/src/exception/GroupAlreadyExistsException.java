package exception;

public class GroupAlreadyExistsException extends Exception {

    public GroupAlreadyExistsException(String message) {
        super(message);
    }

    public GroupAlreadyExistsException() {
        super();
    }

    public GroupAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    protected GroupAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public GroupAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
