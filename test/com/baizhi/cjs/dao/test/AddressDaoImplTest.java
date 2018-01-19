package com.baizhi.cjs.dao.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.baizhi.cjs.dao.AddressDao;
import com.baizhi.cjs.dao.UserDao;
import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.util.MyBatisUtil;

public class AddressDaoImplTest {
	private static Logger log = Logger.getLogger(AddressDaoImplTest.class);
	AddressDao ad = (AddressDao)MyBatisUtil.getMapper(AddressDao.class);
	UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);

	@Test
	public void test1() {
		Address address = ad.selectAddressByName("xiugai1");
		log.info("address:"+address);
		MyBatisUtil.close();
	}
	@Test
	public void test2(){
		Address address = ad.selectAddressByName("ceshi2");
		log.info("address:"+address);
		address.setRecName("xiugai1");
		address.setAddress("ceshi1");
		ad.updateAddress(address);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}
	@Test
	public void test3(){
		User user = ud.selectUserByEmail("ceshi3@qq.com");
		System.out.println(user);
		Address address = new Address(null,"ceshi2","aaa",10000,"1234567","1234567","f","y",user,null);
		ad.insertAddress(address);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

}
