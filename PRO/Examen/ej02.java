import java.util.*;

public class ej02 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        float nota = lec.nextFloat();
        
        if (nota <= 4.9f) {
            System.out.println("Suspenso");
        } else if (nota <= 6.9f) {
            System.out.println("Aprobado");
        } else if (nota <= 8.9f) {
            System.out.println("Notable");
        } else if (nota <= 10f) {
            System.out.println("Sobresaliente");
        }       
    }
}