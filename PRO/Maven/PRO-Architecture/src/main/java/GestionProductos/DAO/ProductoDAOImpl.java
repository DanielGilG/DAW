package GestionProductos.DAO;

import GestionProductos.Model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    public ProductoDAOImpl(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto buscarProducto(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    @Override
    public void actualizarProducto(Producto producto) {
        for (Producto producto1 : productos){
            if (producto1.getId() == producto.getId()){
                producto1.setNombre(producto1.getNombre());
                producto1.setPrecio(producto1.getPrecio());
            }
        }
    }

    @Override
    public void eliminarProducto(int id) {
        for (Producto producto : productos){
            if (producto.getId() == id){
                productos.remove(producto);
            }
        }
    }
}
