package Exercises;
import java.util.ArrayList;
import java.util.List;

public class Flota {

    Coche car1 = new Coche();
    Coche car2 = new Coche();
    Coche car3 = new Coche();

    private void setCarAtributes(){
        car1.marca = "Kia";
        car2.marca = "Ford";
        car3.marca = "Lamborghini";
    }
    public void addToList(Coche car, int numBast){
        System.out.println("Added to list");
    }
    public void removeFromList(Coche car) {
        System.out.println("Removed from list");
    }
    public void showList(){
        System.out.println("(ListContent)");
    }
}