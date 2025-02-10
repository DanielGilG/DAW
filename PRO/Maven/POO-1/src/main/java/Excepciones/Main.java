package Excepciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        int numero;

        try {
            System.out.println("número: ");
            numero = lec.nextInt();
            System.out.println("Resultado: " + (numero * 2));
        } catch (Exception e){
            System.out.println("Algo ha salido mal");
        } finally {
            lec.close();
        }
    }
}