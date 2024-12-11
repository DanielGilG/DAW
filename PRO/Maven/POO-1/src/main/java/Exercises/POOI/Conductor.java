package Exercises.POOI;

public class Conductor {
    String nombre;
    Coche asignado;

    public Conductor(String nombre, Coche asignado){
        this.nombre = nombre;
        this.asignado = asignado;
    }

    public void checkCarInFlota(int numBast, Flota flota){
        asignado = flota.searchCar(numBast);
    }
    public void showAsignedCar(){
        System.out.println("Coche asignado a " + nombre + " : " + asignado);
    }
}
