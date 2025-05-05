package gestionClientesYPedidos.domain.service.impl;

import gestionClientesYPedidos.domain.entity.Customer;
import gestionClientesYPedidos.domain.service.CustomerService;
import gestionClientesYPedidos.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;

    @Override
    public void save(Customer order) {
        customerRepository.save(order);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
