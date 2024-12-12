package Exercises.POOIII;

public class Calculadora {
    static int resultado = 0;

    public static int sumar(int a, int b) {
        resultado = a + b;
        return resultado;
    }
    public static int restar(int a, int b) {
        resultado = a - b;
        return resultado;
    }
    public static int multiplicar(int a, int b) {
        resultado = a * b;
        return resultado;
    }
    public static int dividir(int a, int b) {
        resultado = a / b;
        return resultado;
    }
}
