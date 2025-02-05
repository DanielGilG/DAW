package gestionDispositivos;

public class Sobremesa extends Dispositivo{
    private boolean tieneUPS;

    public Sobremesa(String marca, String modelo, int anyoFabricacion, TipoDispositivo tipoDispositivo, boolean conectado, boolean tieneUPS) {
        super(marca, modelo, anyoFabricacion, tipoDispositivo, conectado);
        this.tieneUPS = tieneUPS;
    }

    @Override
    public void realizarDiagnostico() {
        System.out.println("Diagnóstico del sobremesa: Verificando fuente de alimentación y ventilación.");
    }
}
