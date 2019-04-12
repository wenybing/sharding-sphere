package com.example.shardingsphere.service.impl;

import com.example.shardingsphere.dao.CustomerDao;
import com.example.shardingsphere.entity.Customer;
import com.example.shardingsphere.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/4/1 18:07
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> queryAll() {
        return customerDao.queryAll();
    }

    @Override
    public boolean add(Customer customer) {
        return customerDao.add(customer);
    }

    @Override
    public boolean delete(String customerId) {
        return customerDao.delete(customerId);
    }

    @Override
    public boolean update(Customer customer) {
        return customerDao.update(customer);
    }

    @Override
    public Customer query(long customerId) {
        return customerDao.query(customerId);
    }
}
