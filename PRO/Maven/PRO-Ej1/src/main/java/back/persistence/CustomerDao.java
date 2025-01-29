package back.persistence;

import back.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    public static List<Customer> finAll(){

        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();

        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        return customerList;
    }
}