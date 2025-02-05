package gestionDispositivos;

public class UtilidadesDispositivos {

    public static void mostrarInfoDispositivo(Dispositivo dispositivo){
        System.out.println("Dispositivo: " + dispositivo.getMarca() + " " + dispositivo.getModelo() + ", Año: " +
                dispositivo.getAnyoFabricacion() + ", Tipo: " + dispositivo.getTipoDispositivo() );
        System.out.print("Conectado actualmente: ");
        if (dispositivo.isConectado() == true)
            System.out.println("si");
        else
            System.out.println("no");
    }
}