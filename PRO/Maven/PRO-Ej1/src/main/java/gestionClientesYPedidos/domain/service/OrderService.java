package gestionClientesYPedidos.domain.service;

import gestionClientesYPedidos.domain.entity.Order;

import java.util.List;

public interface OrderService {
    public void save(Order order);
    public Order findById(int id);
    public List<Order> findAll();
}
