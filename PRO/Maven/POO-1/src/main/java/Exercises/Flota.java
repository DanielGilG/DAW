package Exercises;

import java.util.ArrayList;

public class Flota {

    Coche car1 = new Coche("Kia", 123);
    Coche car2 = new Coche("Lambo", 234);
    Coche car3 = new Coche("Ford", 345);
    public static ArrayList<Coche> lista = new ArrayList<Coche>();

    public void addToList(Coche car){
        lista.add(car);
        System.out.println("*Car added to list");
    }
    public void removeFromList(int numBast){
        lista.removeIf(coche -> coche.numBastidor == numBast);
        if (lista.isEmpty()){
            System.out.println("Car not found");
        }
        System.out.println("*Removed car from list");
    }
    public void showList(){
        for (Coche coche: lista){
            System.out.printf(String.valueOf(coche)); //String value para arreglar el error al printf
        }
    }
}