package Exercises;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;

public class Flota {

    Coche car1 = new Coche();
    Coche car2 = new Coche();
    Coche car3 = new Coche();
    HashSet<Coche> lista = new HashSet<Coche>();

    private void setCarAtributes(){
        car1.marca = "Lamborghini";
        car1.numBastidor = 001;
        car2.marca = "Nissan";
        car2.numBastidor = 002;
        car3.marca = "Ford";
        car3.numBastidor = 003;
    }
    public void addToList(Coche car){
        lista.add(car);
        System.out.println("Car added to list");
    }
    public void removeFromList(int numBast){
        System.out.println("Removed from list");
    }
    public void showList(){
        System.out.println("(ListContent)");
    }
}