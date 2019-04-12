package com.example.shardingsphere.dao;

import com.example.shardingsphere.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/27 18:52
 */
@Mapper
public interface OrderItemDao {
    public List<OrderItem> queryAll();

    public boolean add(OrderItem orderItem);

    public boolean delete(long orderItemId);

    public boolean update(OrderItem orderItem);

    public OrderItem query(long orderItemId);

}
