package com.example.shardingsphere.controller;

import com.example.shardingsphere.entity.Order;
import com.example.shardingsphere.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:17
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/queryAll")
    public List<Order> queryAll() {
        List<Order> orders = orderService.queryAll();
        return orders;
    }

    @GetMapping("/query/{orderId}")
    public Order query(@PathVariable("orderId") long orderId) {
        Order order = orderService.query(orderId);
        return order;
    }

    @PostMapping("/add")
    public boolean add(Order order) {
        return orderService.add(order);
    }

    @DeleteMapping("/delete/{orderId}")
    public boolean delete(@PathVariable("orderId") long orderId) {
        return orderService.delete(orderId);
    }

    @PostMapping("/update")
    public boolean update(Order order) {
        return orderService.update(order);
    }


    @RequestMapping("/test/add")
    public String add() {
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            order.setOrderId((long) i);
            order.setUserId((long) i);
            orderService.add(order);
        }
        return "success";
    }

    @RequestMapping("/test01/add")
    public String add01() {
        Order order1 = new Order();
        order1.setOrderId(11);
        order1.setUserId(12);
        orderService.add(order1);
        Order order2 = new Order();
        order2.setOrderId(12);
        order2.setUserId(21);
        orderService.add(order2);
        return "success";
    }

    @RequestMapping("/test/query")
    public List<Order> testQueryAll() {
        List<Order> orders = orderService.queryAll();
        return orders;
    }

}
