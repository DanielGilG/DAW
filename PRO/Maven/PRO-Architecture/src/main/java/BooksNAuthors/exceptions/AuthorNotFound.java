package BooksNAuthors.exceptions;

public class AuthorNotFound extends RuntimeException {
    public AuthorNotFound(String message) {
        super(message);
    }
}
