package gestionDispositivos;

public abstract class Dispositivo implements Conectable{
    private String marca;
    private String modelo;
    private int anyoFabricacion;
    private TipoDispositivo tipoDispositivo;
    private boolean conectado;

    public abstract void realizarDiagnostico();

    public Dispositivo(String marca, String modelo, int anyoFabricacion, TipoDispositivo tipoDispositivo, boolean conectado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyoFabricacion = anyoFabricacion;
        this.tipoDispositivo = tipoDispositivo;
        this.conectado = conectado;
    }

    @Override
    public void conectar() {
        if (this.conectado == false) {
            this.conectado = true;
            System.out.println("Conectando " + this.marca + " " + this.modelo + "...");
        }else {
            System.out.println("Dispositivo " + this.tipoDispositivo + " ya conectado");
        }
    }

    @Override
    public void desconectar() {
        if (this.conectado == true) {
            this.conectado = false;
            System.out.println("Desconectando " + this.marca + " " + this.modelo + "...");
        }else {
            System.out.println("Dispositivo " + this.tipoDispositivo + " ya desconectado");
        }
    }

    @Override
    public boolean comprobarConexion() {
        return this.conectado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public TipoDispositivo getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(TipoDispositivo tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
}
