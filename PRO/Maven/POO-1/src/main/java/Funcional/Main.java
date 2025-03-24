package Funcional;

import java.util.Arrays;
import java.util.List;

import static Funcional.Ej1.suma;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(suma(numeros1));
    }
}
