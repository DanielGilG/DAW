package Funcional;

import java.util.List;

public class Ej5 {
    public static long contarMayores(List<Integer> lista, int valor){
        final long[] count = {0};
        lista.forEach(n -> {
            if (n > valor){
                count[0] ++;
            }
        });
        return count[0];
    }
}
