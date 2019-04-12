package com.example.shardingsphere.dao;

import com.example.shardingsphere.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 18:52
 */
@Mapper
public interface CustomerDao {
    public List<Customer> queryAll();

    public boolean add(Customer customer);

    public boolean delete(String customerId);

    public boolean update(Customer customer);

    public Customer query(long customerId);

}
