package Funcional.stream;

import java.util.List;

public class Ej6 {
    public static String concatenaTodo (List<String> lista){
        return lista.stream().reduce("", String::concat);
    }
}
