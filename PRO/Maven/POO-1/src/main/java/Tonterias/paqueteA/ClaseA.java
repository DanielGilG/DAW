package Tonterias.paqueteA;

import Exercises.POOIII.Calculadora;
import Tonterias.paqueteB.ClaseB;

public class ClaseA {
    public static void main(String[] args) {
        ClaseB otraClase = new ClaseB();

        int a = 1;
        int b = 2;

        System.out.println(Calculadora.sumar(a, b));
    }
}