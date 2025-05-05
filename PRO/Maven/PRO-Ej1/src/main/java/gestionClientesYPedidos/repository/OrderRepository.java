package gestionClientesYPedidos.repository;

import gestionClientesYPedidos.domain.entity.Order;

import java.util.List;

public interface OrderRepository {
    public void save(Order order);
    public Order findById(int id);
    public List<Order> findAll();
}
