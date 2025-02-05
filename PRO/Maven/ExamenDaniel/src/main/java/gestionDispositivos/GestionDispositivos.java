package gestionDispositivos;


public class GestionDispositivos {
    public static void main(String[] args) {
        Portatil p1 = new Portatil("Dell", "d101", 2003, TipoDispositivo.PORTATIL, false, 2.5);
        Sobremesa s1 = new Sobremesa("Corsair", "C9", 2019, TipoDispositivo.SOBREMESA, true, true);
        Tablet t1 = new Tablet("Samsung", "Pad2", 2024, TipoDispositivo.TABLET, true, false);

        UtilidadesDispositivos.mostrarInfoDispositivo(p1);
        p1.realizarDiagnostico();
        if (p1.isConectado() == true)
            p1.desconectar();
        else
            p1.conectar();
        System.out.println("");

        UtilidadesDispositivos.mostrarInfoDispositivo(s1);
        s1.realizarDiagnostico();
        if (s1.isConectado() == true)
            s1.desconectar();
        else
            s1.conectar();
        System.out.println("");

        UtilidadesDispositivos.mostrarInfoDispositivo(t1);
        t1.realizarDiagnostico();
        if (t1.isConectado() == true)
            t1.desconectar();
        else
            t1.conectar();
        System.out.println("");
    }
}
