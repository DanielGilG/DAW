package Excepciones.checkEdad;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lec = new Scanner(System.in);

        try {
            System.out.println("Your Age: ");
            int age = lec.nextInt();
            String result = checkAge(age) ? "Puedes pasar" : "No puedes pasar";
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Algo salió mal... :(");
        }
        finally {
            throw new Exception("Mensaje personalizado Excepcion");
        }
    }

    public static boolean checkAge(int age){
        return age >= 18;
    }
}