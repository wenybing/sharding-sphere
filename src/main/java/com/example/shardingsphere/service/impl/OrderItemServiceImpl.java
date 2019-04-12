package com.example.shardingsphere.service.impl;

import com.example.shardingsphere.dao.OrderItemDao;
import com.example.shardingsphere.entity.OrderItem;
import com.example.shardingsphere.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:10
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemDao orderItemDao;

    @Override
    public List<OrderItem> queryAll() {
        return orderItemDao.queryAll();
    }

    @Override
    public boolean add(OrderItem orderItem) {
        return orderItemDao.add(orderItem);
    }

    @Override
    public boolean delete(long orderItemId) {
        return orderItemDao.delete(orderItemId);
    }

    @Override
    public boolean update(OrderItem orderItem) {
        return orderItemDao.update(orderItem);
    }

    @Override
    public OrderItem query(long orderItemId) {
        return orderItemDao.query(orderItemId);
    }
}
