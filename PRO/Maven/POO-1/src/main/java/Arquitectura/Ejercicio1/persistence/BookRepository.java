package Arquitectura.Ejercicio1.persistence;

import Arquitectura.Ejercicio1.business.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> all();
}