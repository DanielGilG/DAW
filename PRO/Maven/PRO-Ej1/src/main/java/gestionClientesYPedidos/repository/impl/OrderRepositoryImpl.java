package gestionClientesYPedidos.repository.impl;

import gestionClientesYPedidos.domain.entity.Customer;
import gestionClientesYPedidos.domain.entity.Order;
import gestionClientesYPedidos.repository.OrderRepository;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
    Order o1 = new Order();
    Order o2 = new Order();
    Order o3 = new Order();
    Order o4 = new Order();
    List<Order> orders = List.of(o1,o2,o3,o4);

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public Order findById(int id) {
        return (Order) orders.stream().filter(order -> (order.getId() == id));
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }
}
