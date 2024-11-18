import java.util.*;

public class ej04 {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        
        //Una matriz de orden N contiene los N primeros números en orden.
        //  1 2 3 4
        //  2 3 4 1
        //  3 4 1 2
        //  4 1 2 3

        
        //-----------------------MATRIX_CREATION-----------------------------------
        System.out.print("Cuántos números desea?: ");
        int n = lec.nextInt();
        int[][] M = new int[n][n];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int num = j + i + 1;
                if (num > n){ //Parcheado para devolver números correctos.
                    num = Math.abs(n - num);
                }
                M[i][j] = num;
            }
        }


        //-----------------------PRINT-----------------------------------
        for (int[] is : M) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println(" ");
        }
    }
}