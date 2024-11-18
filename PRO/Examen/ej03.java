import java.util.*;

public class ej03 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Un numerito pa multiplicar: ");
        int num = lec.nextInt();
        for (int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d%n", num , i , num*i);
        } 
    }
}
