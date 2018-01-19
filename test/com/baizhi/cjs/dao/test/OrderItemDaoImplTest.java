package com.baizhi.cjs.dao.test;

import org.junit.Test;

import com.baizhi.cjs.dao.BookDao;
import com.baizhi.cjs.dao.OrderDao;
import com.baizhi.cjs.dao.OrderItemDao;
import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.entity.Order;
import com.baizhi.cjs.entity.OrderItem;
import com.baizhi.cjs.util.MyBatisUtil;

public class OrderItemDaoImplTest {
	BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
	OrderDao od = (OrderDao)MyBatisUtil.getMapper(OrderDao.class);
	OrderItemDao oid = (OrderItemDao)MyBatisUtil.getMapper(OrderItemDao.class);
	@Test
	public void test1() {
		Book book = bd.selectBookById(13);
		Order order = od.selectOrderByOrderId(100);
		OrderItem oi = new OrderItem(null,1,4,200.0,book,order);
		oid.insertOrderItem(oi);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

}
