package dependencias;

public class Main {
    public static void main(String[] args) {

        //Creacion de dependencias manualmente
        ServicioDeEnvio servicioDeEnvio = new ServicioDeEnvioExpress();

        //Inyección de dependencias
        GestorDePedidos gestorDePedidos = new GestorDePedidos(servicioDeEnvio);

        //Creacion de cliente y pedido
        Cliente cliente = new Cliente("Max Mueller");
        Pedido pedido = new Pedido("Laptop Dell blabla");

        //Realizar pedido
        gestorDePedidos.realizarPedido(cliente, pedido);
    }
}
