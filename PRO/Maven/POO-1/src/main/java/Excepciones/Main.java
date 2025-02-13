package Excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        try {
            int edad;
            edad = lec.nextInt();

            if (esMayorDeEdad(edad))
                System.out.println("Dale, Pasa");

        }catch (NumberFormatException e){

            System.out.println("La edad tiene que ser un entero");

        }catch (Exception e){

            System.out.println(e.getMessage());

        }finally {

            lec.close();

        }
    }

    public static boolean esMayorDeEdad(int edad) throws Exception {
        if (edad < 18) {
            throw new Exception("Edad menor de 18");
        }
        if (edad > 65) {
            throw new Exception("Edad mayor a 65");
        }
        return true;
    }
}