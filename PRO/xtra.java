public class xtra {
    
    static int getRandomNumber(int min, int max) {
        int range = (max - min) + 1;
        int num = (int) (Math.random() * range) + min;
        return num;
    }

    static int[] fullVector (int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = xtra.getRandomNumber(1, 3);
        }
        return vector;
    }
}
