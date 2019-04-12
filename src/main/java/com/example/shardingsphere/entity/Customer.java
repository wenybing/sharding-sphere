package com.example.shardingsphere.entity;

import lombok.Data;

/**
 * @Author wenyabing
 * @Date 2019/4/1 17:57
 */
@Data
public class Customer {
    /**
     * 客户编号
     */
    private String customerId;
    /**
     * 客户姓名
     */
    private String customerName;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 身份证号
     */
    private String identityNumber;
}
