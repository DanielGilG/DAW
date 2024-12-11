package Exercises.POOI;

public class Coche {
    String marca;
    String modelo;
    String color;
    int numBastidor;
    int velodicad;

    //Constructor
    public Coche(String marca, int numBastidor){
        this.marca = marca;
        this.numBastidor = numBastidor;
    }
    public String toString(){
        return("Marca: " + marca + "%nModelo:" + modelo+ "%nColor:" + color + "%nnumBast: " + numBastidor + "%n");
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