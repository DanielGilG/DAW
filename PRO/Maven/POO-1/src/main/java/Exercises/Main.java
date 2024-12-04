package Exercises;

public class Main {
    public static void main(String[] args) {
       Coche car1 = new Coche();
       Coche car2 = new Coche();

       Flota flota1 = new Flota();

       car1.marca = "Ford";
       car1.modelo = "Fusion";
       car1.color = "gris";
       car1.numBastidor = 123;
       car1.velodicad = 120;

       System.out.println(car1.toString());
       System.out.println("Subir Velocidad: " + car1.increaseVel(car1.velodicad, 10));
       System.out.println("Bajar Velocidad: " + car1.decreaseVel(car1.velodicad, 100));

       flota1.addToList(flota1.car1);
    }
}