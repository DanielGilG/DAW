package gestionClientesYPedidos.domain.service;

import gestionClientesYPedidos.domain.entity.Customer;

import java.util.List;

public interface CustomerService {
    public void save(Customer order);
    public Customer findById(int id);
    public List<Customer> findAll();
}
