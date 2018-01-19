package com.baizhi.cjs.service;

import java.util.List;

import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.entity.User;

public interface AddressService {
	//添加地址
	public void saveAddress(Address address);
	//修改地址
	public void changeAddress(Address address);
	//根据姓名查询地址
	public Address queryAddressByName(String name);
}
