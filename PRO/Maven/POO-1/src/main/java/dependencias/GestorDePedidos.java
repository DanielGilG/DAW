package dependencias;

public class GestorDePedidos {
    private ServicioDeEnvio servicioDeEnvio;

    public GestorDePedidos(ServicioDeEnvio servicioDeEnvio){
        this.servicioDeEnvio = servicioDeEnvio;
    }

    public void realizarPedido(Cliente cliente, Pedido pedido){
        System.out.println("Iniciando el proceso de pedido...");
        servicioDeEnvio.procesarPedido(cliente, pedido);
        System.out.println("Proceso de pedido finalizado");
    }
}
