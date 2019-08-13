package com.example.shardingsphere.service;

import com.example.shardingsphere.ShardingSphereApplicationTests;
import com.example.shardingsphere.entity.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author wenyabing
 * @Date 2019/4/16 14:22
 */
public class OrderServiceTest extends ShardingSphereApplicationTests {
    @Autowired
    OrderService orderService;

    @Test
    public void add() {
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            order.setOrderId((long) i);
            order.setUserId((long) i);
            order.setStatus("0");
            orderService.add(order);
        }
    }

}