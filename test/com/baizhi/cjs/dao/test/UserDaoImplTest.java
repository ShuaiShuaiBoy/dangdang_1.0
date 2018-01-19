package com.baizhi.cjs.dao.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.baizhi.cjs.dao.UserDao;
import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.util.MyBatisUtil;

public class UserDaoImplTest {
	UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);

	
	//查询所有用户
	@Test
	public void test1() {
		List<User> list = ud.selectUserAll();
		for (User user : list) {
			System.out.println(user);
		}
		MyBatisUtil.close();
	}
	//根据id查询用户
	@Test
	public void test2(){
		User user = ud.selectUserById(100000);
		System.out.println(user);
		MyBatisUtil.close();
	}
	//根据email查询用户
	@Test
	public void test3(){
		User user = ud.selectUserByEmail("ceshi1@qq.com");
		System.out.println(user);
		MyBatisUtil.close();
	}
	//添加数据
	@Test
	public void test4(){
		User user = new User();
		user.setEmail("ceshi3@qq.com");
		user.setNickName("测试3");
		user.setPassword("123456");
		user.setState("激活");
		user.setRegisterDate(new Date());
		user.setLastDate(new Date());
		user.setCode("ceshi3");
		ud.insertUser(user);
		System.out.println(user);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}
	//修改用户信息
	@Test
	public void test5(){
		User user = ud.selectUserById(100001);
		user.setEmail("xiugai1@qq.com");
		user.setNickName("修改1");
		user.setCode("xiugai1");
		user.setLastDate(new Date());
		ud.updateUser(user);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}
}
