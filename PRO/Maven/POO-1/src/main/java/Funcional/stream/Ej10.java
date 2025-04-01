package Funcional.stream;

import java.util.List;

public class Ej10 {
    public static long contarComienzaCon(List<String> lista, char letra){
        return lista.stream().filter(s -> s.charAt(0) == letra).count();
    }
}
