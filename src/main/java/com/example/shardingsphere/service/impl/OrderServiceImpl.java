package com.example.shardingsphere.service.impl;

import com.example.shardingsphere.dao.OrderDao;
import com.example.shardingsphere.entity.Order;
import com.example.shardingsphere.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:10
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> queryAll() {
        return orderDao.queryAll();
    }

    @Override
    public boolean add(Order order) {
        return orderDao.add(order);
    }

    @Override
    public boolean delete(long orderId) {
        return orderDao.delete(orderId);
    }

    @Override
    public boolean update(Order order) {
        return orderDao.update(order);
    }

    @Override
    public Order query(long orderId) {
        return orderDao.query(orderId);
    }
}
