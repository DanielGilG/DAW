package back.controller;

import back.domain.CustomerService;

public class CustomerController {
    public static void findAll(){
        System.out.println(CustomerService.finAll());
    }
}