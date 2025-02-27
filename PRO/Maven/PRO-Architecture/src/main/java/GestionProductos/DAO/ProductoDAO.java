package GestionProductos.DAO;

import GestionProductos.Model.Producto;

import java.util.List;

public interface ProductoDAO {
    public void agregarProducto(Producto producto);
    public Producto buscarProducto(int id);
    public List<Producto> listarProductos();
    public void actualizarProducto(Producto producto);
    public void eliminarProducto(int id);
}
