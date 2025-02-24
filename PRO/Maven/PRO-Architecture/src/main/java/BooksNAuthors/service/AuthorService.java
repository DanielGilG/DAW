package BooksNAuthors.service;

import BooksNAuthors.exceptions.AuthorHasBooks;
import BooksNAuthors.exceptions.AuthorNotFound;
import BooksNAuthors.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorService {
    private List<Author> authorList;

    public AuthorService() {
        authorList = new ArrayList<>();
        authorList.add(new Author(1, "Umberto Echo"));
        authorList.add(new Author(2, "J.R.R Tolkien"));
        authorList.add(new Author(3, "Isaac Asimov"));
        authorList.add(new Author(4, "Alejandro Dunas"));
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public Author getAuthorById(int id){
        for (Author author:authorList){
            if (author.getId()==id){
                return author;
            }
        }
        throw new AuthorNotFound("The Author was not found");
    }

    public void addAuthorToList(Author author){
        this.authorList.add(author);
    }

    public void removeAuthor(int id){
        Author author = getAuthorById(id);
        throw new AuthorHasBooks("This Author has asociated Books!");
    }
}
