package Exercises;

public class Coche {
    String marca;
    String modelo;
    String color;
    int numBastidor;
    int velodicad;

    public String toString(){
        return("Mi coche es un " + marca + " " + modelo+ " " + color + " con numero de bastidor " + numBastidor);
    }
    public int increaseVel(int velocity, int quantity){
        velocity += quantity;
        return velocity;
    }
    public int decreaseVel (int velocity, int quantity){
        velocity -= quantity;
        return velocity;
    }
}