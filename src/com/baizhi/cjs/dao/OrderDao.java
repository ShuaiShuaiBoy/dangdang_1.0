package com.baizhi.cjs.dao;

import java.util.List;

import com.baizhi.cjs.entity.Order;

/**
 * Order表的dao
 * @author AdministratorShuai
 *
 */
public interface OrderDao {
	//添加订单
	public void insertOrder(Order order);
	//根据订单号查询
	public Order selectOrderByOrderId(Integer orderId);
	//修改订单信息
	public void updateOrder(Order order);
}
