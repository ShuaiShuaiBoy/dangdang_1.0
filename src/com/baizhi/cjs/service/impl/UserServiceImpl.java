package com.baizhi.cjs.service.impl;

import java.util.Date;

import com.baizhi.cjs.dao.UserDao;
import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.service.UserService;
import com.baizhi.cjs.util.MyBatisUtil;

public class UserServiceImpl implements UserService {

	public User login(User user) {
		UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);
		if(user==null){
			throw new RuntimeException("用户信息不正确！");
		}
		if(user.getEmail()==null || user.getEmail().equals("")){
			throw new RuntimeException("邮箱不能为空！");
		}
		if(user.getPassword()==null || user.getPassword().equals("")){
			throw new RuntimeException("密码不能为空！");
		}
		User userQuery = ud.selectUserByEmail(user.getEmail());
		if(userQuery==null){
			throw new RuntimeException("用户不存在，请注册！");
		}
		if(!userQuery.getPassword().equals(user.getPassword())){
			throw new RuntimeException("密码错误！");
		}
		MyBatisUtil.close();
		return userQuery;
	}

	public void register(User user, String password2) {
		UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);
		if(user==null){
			throw new RuntimeException("用户信息不正确！");
		}
		if(user.getEmail()==null || user.getEmail().equals("")){
			throw new RuntimeException("邮箱不能为空！");
		}
		if(user.getPassword()==null || user.getPassword().equals("")){
			throw new RuntimeException("密码不能为空！");
		}
		if(password2==null || password2.equals("") || !user.getPassword().equals(password2)){
			throw new RuntimeException("两次密码不一致");
		}
		User userQuery = ud.selectUserByEmail(user.getEmail());
		if(userQuery!=null){
			throw new RuntimeException("此邮箱已被注册！");
		}
		user.setState("未激");
		user.setRegisterDate(new Date());
		user.setLastDate(new Date());
		ud.insertUser(user);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

	public void changeUser(User user) {
		UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);
		if(user==null){
			throw new RuntimeException("请输入正确的用户信息");
		}
		if(user.getEmail()==null || user.getEmail().equals("")){
			throw new RuntimeException("邮箱不能为空！");
		}
		if(user.getPassword()==null || user.getPassword().equals("")){
			throw new RuntimeException("密码不能为空！");
		}
		ud.updateUser(user);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

	public void checkEmail(User user) {
		UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);
		user = ud.selectUserByEmail(user.getEmail());
		user.setState("激活");
		ud.updateUser(user);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

	public boolean queryEmail(User user) {
		try{
			UserDao ud = (UserDao)MyBatisUtil.getMapper(UserDao.class);
			if(ud.selectUserByEmail(user.getEmail())==null){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("服务器错误，请稍后");
		}finally{
			MyBatisUtil.close();
		}
	}

}
