package Excepciones.exercises;

import java.util.Scanner;

public class ExceptionManager {
    public static void main(String[] args) {
        ex1();
        System.out.println("---------------------------------");
        ex2();
        System.out.println("---------------------------------");
        ex3();
        System.out.println("---------------------------------");

    }
    public static void ex1(){
        Scanner lec = new Scanner(System.in);
        try {
            System.out.println("Primer Número");
            int num1 = lec.nextInt();
            System.out.println("Segundo Número");
            int num2 = lec.nextInt();
            System.out.println(num1 / num2);
        } catch (Exception e) {
            System.out.println("Error en la operación: ");
            System.out.println(e.getMessage());
        }
    }
    public static void ex2(){
        int[] array = new int[5];
        try {
            System.out.println(array[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en la consulta al Array"); System.out.println(e.getMessage());
        }
    }
    public static void ex3(){
        String string = null;
        try {
            string.toString();
        }catch (NullPointerException e){
            System.out.println("Excepcion en el Objeto");
            System.out.println(e.getMessage());
        }
    }
    public static void ex4(){
        try {
            String cadena = "abcde";
            int entero = Integer.parseInt(cadena);
        } catch (ClassCastException e) {
            System.out.println("Excep en cadenas");
            System.out.println(e.getMessage());
        }
    }
}