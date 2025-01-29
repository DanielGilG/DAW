package back.domain;

import back.persistence.CustomerDao;

import java.util.List;

public class CustomerService {
    public static List<Customer> finAll(){
        return CustomerDao.finAll();
    }
}