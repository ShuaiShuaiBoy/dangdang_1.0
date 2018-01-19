package com.baizhi.cjs.service.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.service.AddressService;
import com.baizhi.cjs.service.impl.AddressServiceImpl;

public class AddressServiceImplTest {
	private static Logger log = Logger.getLogger(AddressServiceImplTest.class);
	AddressService as = new AddressServiceImpl();
	
	@Test
	public void test1() {
//		System.out.println(as.queryAddressByName("ceshi1"));
		Address address = as.queryAddressByName("ceshi1");
		System.out.println(address);
		
	}

}
