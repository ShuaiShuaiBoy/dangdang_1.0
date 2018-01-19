package com.baizhi.cjs.action;

import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.service.AddressService;
import com.baizhi.cjs.service.impl.AddressServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AddressAction extends ActionSupport {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String queryAddress(){
		AddressService as = new AddressServiceImpl();
		address=as.queryAddressByName(address.getRecName());
		System.out.println(address);
		return "success";
	}
}
