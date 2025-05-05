package gestionClientesYPedidos.repository.impl;

import gestionClientesYPedidos.domain.entity.Customer;
import gestionClientesYPedidos.repository.CustomerRepository;

import java.util.List;

public class CustomerReposirotyImpl implements CustomerRepository {
    Customer c1 = new Customer();
    Customer c2 = new Customer();
    Customer c3 = new Customer();
    Customer c4 = new Customer();
    List<Customer> customers = List.of(c1,c2,c3,c4);

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer findById(int id) {
        return (Customer) customers.stream().filter(customer -> (customer.getId() == id));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
