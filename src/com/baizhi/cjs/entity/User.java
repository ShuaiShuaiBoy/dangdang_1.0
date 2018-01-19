package com.baizhi.cjs.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户类对应d_user
 * @author AdministratorShuai
 *
 */
public class User implements Serializable{
	//id
	private Integer id;
	//邮箱（用户账号）
	private String email;
	//昵称
	private String nickName;
	//密码
	private String password;
	//用户状态
	private String state;
	//注册时间
	private Date registerDate;
	//最后登陆时间
	private Date lastDate;
	//邮箱验证码
	private String code;
	//地址集合
	private List<Address> addresses = new ArrayList<Address>();
	//订单集合
	private List<Order> orders = new ArrayList<Order>();
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String email, String nickName, String password,
			String state, Date registerDate, Date lastDate, String code,
			List<Address> addresses, List<Order> orders) {
		super();
		this.id = id;
		this.email = email;
		this.nickName = nickName;
		this.password = password;
		this.state = state;
		this.registerDate = registerDate;
		this.lastDate = lastDate;
		this.code = code;
		this.addresses = addresses;
		this.orders = orders;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", nickName=" + nickName
				+ ", password=" + password + ", state=" + state
				+ ", registerDate=" + registerDate + ", lastDate=" + lastDate
				+ ", code=" + code + ", addresses=" + addresses + ", orders="
				+ orders + "]";
	}
	
}
