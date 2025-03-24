package Funcional;

import java.util.List;

public class Ej1 {
    public static int suma (List<Integer> lista){
        int[] suma = {0};
        lista.forEach(n -> suma[0] += n);
        return suma[0];
    }
}
