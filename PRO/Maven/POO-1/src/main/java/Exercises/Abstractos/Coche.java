package Exercises.Abstractos;

public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, int year) {
        super(marca, modelo, year);
    }

    public void abrirMaletero(){
        System.out.println("Malereto abierto");
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
