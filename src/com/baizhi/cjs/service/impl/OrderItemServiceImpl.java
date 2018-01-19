package com.baizhi.cjs.service.impl;

import com.baizhi.cjs.dao.OrderItemDao;
import com.baizhi.cjs.entity.OrderItem;
import com.baizhi.cjs.service.OrderItemService;
import com.baizhi.cjs.util.MyBatisUtil;

public class OrderItemServiceImpl implements OrderItemService {

	public void saveOrderItem(OrderItem orderItem) {
		OrderItemDao oid=(OrderItemDao)MyBatisUtil.getMapper(OrderItemDao.class);
		oid.insertOrderItem(orderItem);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

}
