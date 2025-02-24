package BooksNAuthors.service;

import BooksNAuthors.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> bookList;

    public BookService(){
        bookList = new ArrayList<>();
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Book getBookById(List<Book> list){
        return list.getFirst();
    }

    public void addBookToList(Book book){
        this.bookList.add(book);
    }

    public Book getBookByAuthor(int authorId){
        return bookList.getFirst();
    }
}