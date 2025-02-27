package OrderManager.Service;

import OrderManager.DAO.OrderDAO;
import OrderManager.Model.Order;

public class OrderService {
    private OrderDAO orderDAO;

    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public double totalsum(Order order) {
        return orderDAO.totalsum(order);
    }

    public void createOrder(Order order) {
        orderDAO.createOrder(order);
    }

    public void getEveryOrder() {
       orderDAO.getEveryOrder();
    }

    public Order searchOrderById(int id) {
        return orderDAO.searchOrderById(id);
    }

    public void updateOrder(Order order){
        orderDAO.updateOrder(order);
    }

    public void removeOrder(int id){
        orderDAO.removeOrder(id);
    }
}
