package Arquitectura.Ejercicio1.persistence.impl;

import Arquitectura.Ejercicio1.business.entity.Book;
import Arquitectura.Ejercicio1.persistence.BookRepository;

import java.util.List;

public class StaticBookRepositoryImpl implements BookRepository {

    List<Book> books = List.of(
            new Book(1, "El nombre de la rosa", "Umberto Eco"),
            new Book(2, "La insoportable levedad del ser", "Milan Kundera"),
            new Book(3, "1Q84","Haruki Murakami")
    );

    @Override
    public List<Book> all() {
        return List.of();
    }
}