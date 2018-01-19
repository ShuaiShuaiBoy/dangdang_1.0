package com.baizhi.cjs.dao;

import java.util.List;

import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.entity.User;

/**
 * Address的dao
 * @author AdministratorShuai
 *
 */
public interface AddressDao {
	//添加地址
	public void insertAddress(Address address);
	//修改地址
	public void updateAddress(Address address);
	//根据姓名查找地址
	public Address selectAddressByName(String name);
}
