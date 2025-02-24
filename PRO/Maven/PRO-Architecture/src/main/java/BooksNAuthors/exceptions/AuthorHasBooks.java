package BooksNAuthors.exceptions;

public class AuthorHasBooks extends RuntimeException {
  public AuthorHasBooks(String message) {
    super(message);
  }
}
