package com.baizhi.cjs.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 地址实体类对应d_address
 * @author AdministratorShuai
 *
 */
public class Address implements Serializable{
	//id
	private Integer id;
	//收件人姓名
	private String recName;
	//详细地址
	private String address;
	//邮政编码
	private int postCode;
	//电话
	private String telphone;
	//手机
	private String mobile;
	//是否是默认地址
	private String defaultAddress;
	//地址状态
	private String addressState;
	//外键（用户id）
	private User user;
	//订单集合
	private List<Order> orders = new ArrayList<Order>();
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(Integer id, String recName, String address, int postCode,
			String telphone, String mobile, String defaultAddress,
			String addressState, User user, List<Order> orders) {
		super();
		this.id = id;
		this.recName = recName;
		this.address = address;
		this.postCode = postCode;
		this.telphone = telphone;
		this.mobile = mobile;
		this.defaultAddress = defaultAddress;
		this.addressState = addressState;
		this.user = user;
		this.orders = orders;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRecName() {
		return recName;
	}
	public void setRecName(String recName) {
		this.recName = recName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDefaultAddress() {
		return defaultAddress;
	}
	public void setDefaultAddress(String defaultAddress) {
		this.defaultAddress = defaultAddress;
	}
	public String getAddressState() {
		return addressState;
	}
	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", recName=" + recName + ", address="
				+ address + ", postCode=" + postCode + ", telphone=" + telphone
				+ ", mobile=" + mobile + ", defaultAddress=" + defaultAddress
				+ ", addressState=" + addressState + ", user=" + user
				+ ", orders=" + orders + "]";
	}
	
}
