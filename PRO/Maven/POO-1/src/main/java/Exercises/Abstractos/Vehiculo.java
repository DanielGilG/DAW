package Exercises.Abstractos;

abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int year;

    public Vehiculo (String marca, String modelo, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public abstract void arrancar();

    public abstract void detener();

    public abstract double calcularImpuestos();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}