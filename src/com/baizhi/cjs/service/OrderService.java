package com.baizhi.cjs.service;

import com.baizhi.cjs.entity.Order;

public interface OrderService {
	//添加订单
	public void saveOrder(Order order);
	//查询订单
	public Order queryOrderByOrderId(Integer orderId);
	//修改订单
	public void changeOrder(Order order);
}
