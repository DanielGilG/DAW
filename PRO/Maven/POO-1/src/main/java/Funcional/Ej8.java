package Funcional;

import java.util.ArrayList;
import java.util.List;

public class Ej8 {
    public static List<Integer> duplicados (List<Integer> lista){
        List<Integer> sinDuplicados = new ArrayList<>();
        lista.forEach(n -> {
            if (!sinDuplicados.contains(n)){
                sinDuplicados.add(n);
            }
        });
        return sinDuplicados;
    }
}
