package OrderManager.DAO;

import OrderManager.Model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    List<Order> orders = new ArrayList<>();

    @Override
    public double totalsum(Order order) {
        double suma = 0;
        for (int i = 0; i < order.getProducts().size(); i++) {
            suma += order.getProducts().get(i).getPrice();
        }
        return suma;
    }

    @Override
    public void createOrder(Order order) {
        orders.add(order);
    }

    @Override
    public List<Order> getEveryOrder() {
        return orders;
    }

    @Override
    public Order searchOrderById(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                return orders.get(id);
            }
        }
        return null;
    }

    @Override
    public void updateOrder(Order order) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == order.getId()) {
                orders.set(i, order);
                return;
            }
        }
    }

    @Override
    public void removeOrder(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                orders.remove(id);
                return;
            }
        }
    }
}