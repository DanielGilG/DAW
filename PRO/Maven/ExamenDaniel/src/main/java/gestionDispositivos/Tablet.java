package gestionDispositivos;

public class Tablet extends Dispositivo{
    private boolean tieneStylus;

    public Tablet(String marca, String modelo, int anyoFabricacion, TipoDispositivo tipoDispositivo, boolean conectado, boolean tieneStylus) {
        super(marca, modelo, anyoFabricacion, tipoDispositivo, conectado);
        this.tieneStylus = tieneStylus;
    }

    @Override
    public void realizarDiagnostico() {
        System.out.println("Diagnóstico de la tablet: Comprobando pantalla táctil y conexión Wi-Fi.");
    }
}
