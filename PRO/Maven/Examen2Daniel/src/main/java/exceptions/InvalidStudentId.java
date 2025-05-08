package exceptions;

public class InvalidStudentId extends RuntimeException {
    public InvalidStudentId(String message) {
        super(message);
    }
}
