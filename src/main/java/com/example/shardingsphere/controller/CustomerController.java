package com.example.shardingsphere.controller;

import com.dangdang.ddframe.rdb.sharding.id.generator.IdGenerator;
import com.example.shardingsphere.entity.Customer;
import com.example.shardingsphere.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:17
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private IdGenerator idGenerator;

    @GetMapping("/queryAll")
    public List<Customer> queryAll() {
        List<Customer> customers = customerService.queryAll();
        return customers;
    }

    @GetMapping("/query/{customerId}")
    public Customer query(@PathVariable("customerId") long customerId) {
        Customer customer = customerService.query(customerId);
        return customer;
    }

    @PostMapping("/add")
    public boolean add(Customer customer) {
        customer.setCustomerId(idGenerator.generateId().toString());
        return customerService.add(customer);
    }

    @DeleteMapping("/delete/{customerId}")
    public boolean delete(@PathVariable("customerId") String customerId) {
        return customerService.delete(customerId);
    }

    @PostMapping("/update")
    public boolean update(Customer customer) {
        return customerService.update(customer);
    }

}
