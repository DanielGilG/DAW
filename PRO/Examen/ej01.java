import java.util.*;

public class ej01 {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
    
        System.out.print("Dime una cantidad de euros y el factor(con , ): ");
    
        int cantidad = lec.nextInt();
        double factor = lec.nextDouble();
    
    
        double resultado = cantidad * factor;
    
        System.out.println(resultado + " dólares");
    }
    
}