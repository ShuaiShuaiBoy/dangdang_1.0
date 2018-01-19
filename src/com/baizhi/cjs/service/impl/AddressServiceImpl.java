package com.baizhi.cjs.service.impl;

import java.util.List;

import com.baizhi.cjs.dao.AddressDao;
import com.baizhi.cjs.dao.UserDao;
import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.service.AddressService;
import com.baizhi.cjs.util.MyBatisUtil;

public class AddressServiceImpl implements AddressService {

	public void saveAddress(Address address) {
		AddressDao ad = (AddressDao)MyBatisUtil.getMapper(AddressDao.class);
		address.setAddressState("y");
		address.setDefaultAddress("f");
		ad.insertAddress(address);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

	public void changeAddress(Address address) {
		AddressDao ad = (AddressDao)MyBatisUtil.getMapper(AddressDao.class);
		ad.updateAddress(address);
		MyBatisUtil.commit();
		MyBatisUtil.close();
	}

	public Address queryAddressByName(String name) {
		AddressDao ad = (AddressDao)MyBatisUtil.getMapper(AddressDao.class);
		Address address = ad.selectAddressByName(name);
		MyBatisUtil.close();
		return address;
	}

}
