package Arquitectura.gestionLibros;

public class Revista extends Publicacion{
    private int numeroEdicion;

    public Revista(String titulo, double precio, boolean disponible, int numeroEdicion) {
        super(titulo, precio, disponible);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEdicion=" + numeroEdicion +
                "titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", disponible=" + isDisponible() +
                '}';
    }
}
