package MachineProject.Proto;

public abstract class Rotor {
    private final String[][] config = new String[4][4]; // Configuración de letras conectadas
    private boolean rotDirection; // Dirección (horario o antihorario)
    private String input; // Letra de entrada
    private String output; // Letra de salida
    private int position; // Posición de rotacion para cada turno

    public Rotor(boolean rotDirection, String input, String output, int position) {
        this.rotDirection = rotDirection;
        this.input = input;
        this.output = output;
        this.position = position;
    }

    public Rotor(){
    }

    void rotate(){
    }
}