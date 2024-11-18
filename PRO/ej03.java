public class ej03 {
    public static void main(String[] args) {
        int[] V = new int[50];
        int[] P = new int[20];
        int[][] M = new int[50][20];

        //M[i][j] = I*J----------------------------------------------------------

        V = fullVector(V);
        P = fullVector(P);

        System.out.print("V contains: ");
        for (int is : V) {
            System.out.print(is + " ");
        }
        System.out.println(" ");
        System.out.print("P contains: ");
        for (int is : P) {
            System.out.print(is + " ");
        }
        System.out.println(" ");
        System.out.println("M size: " + M.length + "*" + M[0].length);

        System.out.println("----------------RESULT-----------------");

        //Calcula M----------------------------------------------------------
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = V[i] * P[j];
            }
        }

        for (int[] is : M) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println(" ");
        }
    }


    static int[] fullVector (int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = ej01.getRandomNumber(1, 3);
        }
        return vector;
    }
}

//con: 1, 2, 3
// 1, 2, 3, 4, 6, 9