package Exercises;

public class Main {
    public static void main(String[] args) {
       Coche car1 = new Coche(null, 0);
       Coche car2 = new Coche(null, 0);
       Flota flota1 = new Flota();
       Conductor conductor1 = new Conductor("Pepe", car1);
       Conductor conductor2 = new Conductor("Pepe", car2);

       car1.marca = "Ford";
       car1.modelo = "Fusion";
       car1.color = "gris";
       car1.numBastidor = 123;
       car1.velodicad = 120;

       System.out.println(car1.toString());
       System.out.println("Subir Velocidad: " + car1.increaseVel(car1.velodicad, 10));
       System.out.println("Bajar Velocidad: " + car1.decreaseVel(car1.velodicad, 100));
       System.out.printf("----------------------%n%n");

       flota1.addToList(flota1.car1);
       flota1.addToList(flota1.car2);
       flota1.showList();
       flota1.removeFromList(123);
       flota1.showList();
    }
}
//https://gist.github.com/hansrajdas/6520d74ac3251552e66a76f2f32b4bdd