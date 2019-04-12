package com.example.shardingsphere.controller;

import com.dangdang.ddframe.rdb.sharding.id.generator.IdGenerator;
import com.example.shardingsphere.entity.OrderItem;
import com.example.shardingsphere.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 23:17
 */
@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;
    @Autowired
    private IdGenerator idGenerator;

    @GetMapping("/queryAll")
    public List<OrderItem> queryAll() {
        List<OrderItem> orderItems = orderItemService.queryAll();
        return orderItems;
    }

    @GetMapping("/query/{orderItemId}")
    public OrderItem query(@PathVariable("orderItemId") long orderItemId) {
        OrderItem orderItem = orderItemService.query(orderItemId);
        return orderItem;
    }

    @PostMapping("/add")
    public boolean add(OrderItem orderItem) {
        orderItem.setOrderItemId(idGenerator.generateId().longValue());
        return orderItemService.add(orderItem);
    }

    @DeleteMapping("/delete/{orderItemId}")
    public boolean delete(@PathVariable("orderItemId") long orderId) {
        return orderItemService.delete(orderId);
    }

    @PutMapping("/update")
    public boolean update(OrderItem orderItem) {
        return orderItemService.update(orderItem);
    }

    @RequestMapping("/test/add")
    public String add() {
        for (int i = 1; i <= 10; i++) {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderItemId(idGenerator.generateId().longValue());
            orderItem.setOrderId((long) i);
            orderItem.setUserId((long) i);
            orderItemService.add(orderItem);
        }
        return "success";
    }
}
