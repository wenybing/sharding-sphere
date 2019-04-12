package com.example.shardingsphere.service;

import com.example.shardingsphere.entity.OrderItem;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:12
 */
public interface OrderItemService {
    public List<OrderItem> queryAll();

    public boolean add(OrderItem order);

    public boolean delete(long orderItemId);

    public boolean update(OrderItem orderItem);

    public OrderItem query(long orderItemId);
}
