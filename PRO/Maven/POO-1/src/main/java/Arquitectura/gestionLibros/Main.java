package Arquitectura.gestionLibros;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("George Orwell", "Ingles", 70);
        Autor autor2 = new Autor("Kafka", "Ingles", 80);
        Autor autor3 = new Autor("Umberto Eco", "Italia", 100);

        Libro l1 = new Libro("1984", autor1, 19.99, true);
        Libro l2 = new Libro("La Metamorfosis", autor2, 15.99, true);
        Libro l3 = new Libro("El Nombre de la Rosa", autor3, 10, false);

        Revista r1 = new Revista("Coches de Gama", 20, true, 1314);

        Biblioteca b1 = new Biblioteca();
        b1.addBookToLibrary(l1);
        b1.addBookToLibrary(l2);
        b1.addBookToLibrary(l3);
        b1.addBookToLibrary(r1);

        b1.showAvailableBooks();
        b1.searchBookByTitle("1984");
        b1.searchBookByTitle("Coches de Gama");
    }
}