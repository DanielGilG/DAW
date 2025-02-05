package gestionDispositivos;

public class Portatil extends Dispositivo{
    private double peso;

    public Portatil(String marca, String modelo, int anyoFabricacion, TipoDispositivo tipoDispositivo, boolean conectado, double peso) {
        super(marca, modelo, anyoFabricacion, tipoDispositivo, conectado);
        if (peso <= 0)
            System.out.println("Peso del Portatil Negativo!!");
        this.peso = peso;
    }

    @Override
    public void realizarDiagnostico() {
        System.out.println("Diagnóstico del portátil: Comprobando estado de la batería y discos");
    }
}