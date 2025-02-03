package Arquitectura.gestionLibros;

public class Libro extends Publicacion{
    private Autor autor;

    public Libro(String titulo, Autor autor, double precio, boolean disponible) {
        super(titulo, precio, disponible);
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + getPrecio() +
                ", disponible=" + isDisponible() +
                '}';
    }
}