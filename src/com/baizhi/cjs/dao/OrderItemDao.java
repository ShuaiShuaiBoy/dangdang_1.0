package com.baizhi.cjs.dao;

import java.util.List;

import com.baizhi.cjs.entity.OrderItem;

/**
 * orderItem的dao
 * @author AdministratorShuai
 *
 */
public interface OrderItemDao {
	//添加订单项
	public void insertOrderItem(OrderItem orderItem);
}
