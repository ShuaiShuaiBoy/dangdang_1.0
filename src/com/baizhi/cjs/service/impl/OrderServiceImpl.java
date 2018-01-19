package com.baizhi.cjs.service.impl;

import com.baizhi.cjs.dao.OrderDao;
import com.baizhi.cjs.entity.Order;
import com.baizhi.cjs.service.OrderService;
import com.baizhi.cjs.util.MyBatisUtil;

public class OrderServiceImpl implements OrderService {

	public void saveOrder(Order order) {
		OrderDao od = (OrderDao)MyBatisUtil.getMapper(OrderDao.class);
		od.insertOrder(order);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

	public Order queryOrderByOrderId(Integer orderId) {
		OrderDao od = (OrderDao)MyBatisUtil.getMapper(OrderDao.class);
		Order order = od.selectOrderByOrderId(orderId);
		MyBatisUtil.close();
		return order;
	}

	public void changeOrder(Order order) {
		OrderDao od = (OrderDao)MyBatisUtil.getMapper(OrderDao.class);
		od.updateOrder(order);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

}
