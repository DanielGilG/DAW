package Funcional;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static List<Integer> pares (List<Integer> lista){
        List<Integer> pares = new ArrayList<>();
        pares.forEach(n -> {
            if (n % 2 == 0){
                pares.add(n);
            }
        });
        return pares;
    }
}
