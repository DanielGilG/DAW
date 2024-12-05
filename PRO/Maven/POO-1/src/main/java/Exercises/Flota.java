package Exercises;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;

public class Flota {

    Coche car1 = new Coche("Kia", 0);
    Coche car2 = new Coche("Lambo", 1);
    Coche car3 = new Coche("Ford", 2);
    ArrayList<Coche> lista = new ArrayList<Coche>();

    public void addToList(Coche car){
        lista.add(car);
        System.out.println("*Car added to list");
    }
    public void removeFromList(int numBast){
        lista.remove(numBast);
        System.out.println("*Removed from list");
    }
    public void showList(){
        for (Coche coche: lista){
            System.out.printf(String.valueOf(coche)); //String value para arreglar el error al printf
        }
    }
}