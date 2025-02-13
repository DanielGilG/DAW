package Excepciones.ejercicio4.persistance;

public class Libro {
    private int id;
    private String titulo;
    private int idAutor;

    public Libro(int id, String titulo, int idAutor) {
        this.id = id;
        this.titulo = titulo;
        this.idAutor = idAutor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIdAutor() {
        return idAutor;
    }
}
