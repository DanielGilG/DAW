package Funcional.stream;

import java.util.List;

public class Ej3 {
    public static List<String> todoMayus (List<String> lista){
        return lista.stream().map(String::toUpperCase).toList();
    }
}
