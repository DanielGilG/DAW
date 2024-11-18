public class ej01 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][7];

        System.out.println("Matrix length: " + matrix.length + "*" + matrix[0].length);

        //-----------------Llena la matriz de número aleatorios
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = getRandomNumber(0, 9);
            }
        }

        //--------------Printea toda la matriz
        for (int[] is : matrix) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println(" ");
        }
    }
    //-------------------Métodos
    static int getRandomNumber(int min, int max) {
        int range = (max - min) + 1;
        int num = (int) (Math.random() * range) + min;
        return num;
    }
}