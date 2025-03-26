package Funcional;

import java.util.List;

public class Ej6 {
    public static String concatenar(List<String> lista){
        StringBuilder sb = new StringBuilder();
        lista.forEach(s -> sb.append(s));
        return sb.toString();
    }
}
