package gestionClientesYPedidos.domain.service.impl;

import gestionClientesYPedidos.domain.entity.Order;
import gestionClientesYPedidos.domain.service.OrderService;
import gestionClientesYPedidos.repository.OrderRepository;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderRepository orderRepository;

    @Override
    public void save(Order order) {
       orderRepository.save(order);
    }

    @Override
    public Order findById(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
