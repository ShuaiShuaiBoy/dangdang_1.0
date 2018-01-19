package com.baizhi.cjs.service.test;

import java.util.Date;

import org.junit.Test;

import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.service.impl.UserServiceImpl;

public class UserServiceImplTest {
	UserServiceImpl us = new UserServiceImpl();
	@Test
	public void test1() {
		User user = new User();
		user.setEmail("xiugai1@qq.com");
		user.setPassword("123456");
		us.login(user);
	}
	@Test
	public void test2(){
		User user = new User();
		user.setEmail("ceshi4@qq.com");
		user.setNickName("测试4");
		user.setPassword("123456");
		user.setRegisterDate(new Date());
		user.setLastDate(new Date());
		user.setCode("ceshi4");
		us.register(user, "123456");
		
	}
	@Test
	public void test3(){
		User user = new User();
		user.setEmail("aa");
		boolean b = us.queryEmail(user);
		System.out.println(b);
	}
}
