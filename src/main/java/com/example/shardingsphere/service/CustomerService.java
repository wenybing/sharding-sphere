package com.example.shardingsphere.service;

import com.example.shardingsphere.entity.Customer;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/4/1 18:06
 */
public interface CustomerService {
    public List<Customer> queryAll();

    public boolean add(Customer customer);

    public boolean delete(String customerId);

    public boolean update(Customer customer);

    public Customer query(long customerId);
}
