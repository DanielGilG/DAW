package Exercises.POOIII;

public class Singleton {
    private Singleton instancia;

    private Singleton(){}

    public Singleton getInstance(){
       if (instancia == null) {
           instancia = new Singleton();
       }
       return instancia;
    }
}