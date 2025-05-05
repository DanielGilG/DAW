package gestionClientesYPedidos.repository;

import gestionClientesYPedidos.domain.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    public void save(Customer customer);
    public Customer findById(int id);
    public List<Customer> findAll();
}
