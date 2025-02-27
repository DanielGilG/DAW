package GestionProductos.Service;

import GestionProductos.DAO.ProductoDAO;
import GestionProductos.Model.Producto;

import java.util.List;

public class ProductoService {
    private ProductoDAO productoDAO;

    public void agregarProducto(Producto producto){
        for (Producto producto1 : productoDAO.listarProductos()){
            if (producto1.getId() == producto.getId()){
                throw new RuntimeException("La clave: " + producto1.getId() + " ya está en uso.");
            }
        }
        if (producto.getNombre().equals(null)){
            throw new RuntimeException("El nombre del producto está vacío");
        }
        if (producto.getPrecio() < 0){
            throw new RuntimeException("El precio: " + producto.getPrecio() + " es negativo");
        }
        productoDAO.agregarProducto(producto);
    }

    public Producto buscarProducto(int id){
        return productoDAO.buscarProducto(id);
    }

    public List<Producto> listarProductos(){
        return productoDAO.listarProductos();
    }

    public void actualizarProductos(Producto producto)  {
        productoDAO.actualizarProducto(producto);
    }

    public void eliminarProducto(int id){
        productoDAO.eliminarProducto(id);
    }
}
