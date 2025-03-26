package Funcional.stream;

import java.util.List;

public class Ej4 {
    public static Integer elMaximo (List<Integer> lista){
        return lista.stream().mapToInt(Integer::intValue).max().orElseThrow();
    }
}
