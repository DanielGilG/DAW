package Funcional;

import java.util.List;

public class Ej10 {
    public static long contarLetra (List<String> lista, String letra){
        int[] contador = {0};
        lista.forEach(s -> {
            if (s.startsWith(letra)){
                contador[0]++;
            }
        });
        return contador[0];
    }
}
