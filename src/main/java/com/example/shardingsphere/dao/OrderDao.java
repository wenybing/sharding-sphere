package com.example.shardingsphere.dao;

import com.example.shardingsphere.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 18:52
 */
@Mapper
public interface OrderDao {
    public List<Order> queryAll();

    public boolean add(Order order);

    public boolean delete(long orderId);

    public boolean update(Order order);

    public Order query(long orderId);

}
