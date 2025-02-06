package dependencias;

public class ServicioDeEnvioExpress implements ServicioDeEnvio {

    @Override
    public void procesarPedido(Cliente cliente, Pedido pedido) {
        System.out.println("Procesando pedido para el cliente: " + cliente.getNombre());
        System.out.println("Descripcion del pedido: " + pedido.getDescripcion());
        System.out.println("El pedido ha sido enviado.");

    }
}