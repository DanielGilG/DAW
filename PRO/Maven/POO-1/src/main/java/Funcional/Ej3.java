package Funcional;

import java.util.ArrayList;
import java.util.List;

public class Ej3 {
    public static List<String> aMayus (List<String> lista){
        List<String> mayus = new ArrayList<>();
        lista.forEach(n -> mayus.add(n.toUpperCase()));
        return mayus;
    }
}
