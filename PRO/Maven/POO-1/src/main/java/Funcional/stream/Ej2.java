package Funcional.stream;

import java.util.List;

public class Ej2 {
    public static List<Integer> soloPares (List<Integer> lista){
        return lista.stream().filter(n -> n % 2 == 0).toList();
    }
}
