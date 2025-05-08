package exceptions;

public class InvalidLevel extends RuntimeException {
    public InvalidLevel(String message) {
        super(message);
    }
}
