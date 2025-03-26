package Funcional;

import java.util.ArrayList;
import java.util.List;

public class Ej7 {
    public static List<Integer> cuadrados (List<Integer> lista){
        List<Integer> cuadrados = new ArrayList<>();
        lista.forEach(n -> cuadrados.add(n * n));
        return cuadrados;
    }
}
