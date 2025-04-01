package Funcional.stream;

import java.util.List;

public class Ej7 {
    public static List<Integer> cuadrados(List<Integer> lista){
        return lista.stream().map(n -> n * n).toList();
    }
}
