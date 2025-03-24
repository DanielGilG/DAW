package Funcional;

import java.util.List;

public class Ej4 {
    public static int maximo (List<Integer> lista){
        int[] max = {Integer.MIN_VALUE};
        lista.forEach(n -> {
            if (n > max[0]) {
                max[0] = n;
            }
        });
        return max[0];
    }
}
