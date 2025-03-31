package Funcional.stream;

import java.util.List;

public class Ej5 {
    public static long cuantosMayoresQue (List<Integer> lista, int valor){
        return lista.stream().filter(n -> n > valor).count();
    }
}
