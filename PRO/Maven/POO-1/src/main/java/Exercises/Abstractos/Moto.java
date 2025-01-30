package Exercises.Abstractos;

public class Moto extends Vehiculo{

    public Moto(String marca, String modelo, int year) {
        super(marca, modelo, year);
    }

    @Override
    public void arrancar() {
    }

    @Override
    public void detener() {
    }

    @Override
    public double calcularImpuestos() {
        return 0;
    }
}