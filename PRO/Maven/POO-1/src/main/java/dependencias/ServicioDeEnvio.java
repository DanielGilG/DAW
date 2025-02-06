package dependencias;

public abstract interface ServicioDeEnvio {
    public abstract void procesarPedido(Cliente cliente, Pedido pedido);
}