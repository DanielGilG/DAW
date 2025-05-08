package exceptions;

public class InvalidCourseId extends RuntimeException {
    public InvalidCourseId(String message) {
        super(message);
    }
}
