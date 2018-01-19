package com.baizhi.cjs.service;

import com.baizhi.cjs.entity.User;

/**
 * User的业务处理层
 * @author AdministratorShuai
 *
 */
public interface UserService {
	//登陆
	public User login(User user);
	//注册
	public void register(User user,String password2);
	//修改用户信息
	public void changeUser(User user);
	//验证邮箱
	public void checkEmail(User user);
	//查询email是否存在
	public boolean queryEmail(User user);
}
