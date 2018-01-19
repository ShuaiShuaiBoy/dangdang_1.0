package com.baizhi.cjs.dao.test;

import java.util.Date;

import org.junit.Test;

import com.baizhi.cjs.dao.AddressDao;
import com.baizhi.cjs.dao.OrderDao;
import com.baizhi.cjs.dao.UserDao;
import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.entity.Order;
import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.util.MyBatisUtil;

public class OrderDaoImplTest {
	OrderDao od = (OrderDao)MyBatisUtil.getMapper(OrderDao.class);
	AddressDao ad = (AddressDao)MyBatisUtil.getMapper(AddressDao.class);
	UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);
	@Test
	public void test1() {
		User user = ud.selectUserByEmail("ceshi3@qq.com");
		Address address = ad.selectAddressByName("ceshi1");
		Order order = new Order(null,100,200.0,new Date(),"f",address,user);
		od.insertOrder(order);
		System.out.println(order);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}
	@Test
	public void test2(){
		Order order = od.selectOrderByOrderId(100);
		System.out.println(order);
		MyBatisUtil.close();
	}
	@Test
	public void test3(){
		Order order = od.selectOrderByOrderId(100);
		order.setOrderDate(new Date());
		order.setTotal(300.0);
		od.updateOrder(order);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}
}
