package com.example.shardingsphere.service;

import com.example.shardingsphere.entity.Order;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:12
 */
public interface OrderService {
    public List<Order> queryAll();

    public boolean add(Order order);

    public boolean delete(long orderId);

    public boolean update(Order order);

    public Order query(long orderId);
}
