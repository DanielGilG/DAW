package Funcional;

import java.util.List;

public class Ej9 {
    public static Integer mayorque (List<Integer> lista, int valor){
        final Integer[] numeros = {null};
        lista.forEach(n -> {
            if (n > valor && numeros[0] == null){
                numeros[0] = n;
            }
        });
        return numeros[0];
    }
}
