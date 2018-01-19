package com.baizhi.cjs.dao;

import java.util.List;

import com.baizhi.cjs.entity.User;

/**
 * user的dao
 * @author AdministratorShuai
 *
 */
public interface UserDao {
	//查询所有用户
	public List<User> selectUserAll();
	//增加用户
	public void insertUser(User user);
	//删除用户
	public void deleteUserById(Integer id);
	//修改用户信息
	public void updateUser(User user);
	//根据id查询用户
	public User selectUserById(Integer id);
	//根据email查询用户
	public User selectUserByEmail(String email);
	
}
