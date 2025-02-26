package OrderManager.DAO;

import OrderManager.Model.Order;
import OrderManager.Model.Product;

import java.util.List;

public interface OrderDAO {
    abstract double totalsum(Order order);

    abstract void createOrder(Order order);

    abstract List<Order> getEveryOrder();

    abstract Order searchOrderById(int id);

    abstract void updateOrder(Order order);

    abstract void removeOrder(int id);
}
