package Arquitectura.gestionLibros;

public class Publicacion {
    protected String titulo;
    protected double precio;
    protected boolean disponible;
    private static int contadorPublicaciones = 0;

    protected Publicacion(String titulo, double precio, boolean disponible) {
        this.titulo = titulo;
        this.precio = precio;
        this.disponible = disponible;
        contadorPublicaciones++;
    }

    public static int getNumeroPublicaciones(){
        return contadorPublicaciones;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected double getPrecio() {
        return precio;
    }

    protected void setPrecio(double precio) {
        this.precio = precio;
    }

    protected boolean isDisponible() {
        return disponible;
    }

    protected void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }
}