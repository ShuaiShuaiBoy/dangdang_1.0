package com.baizhi.cjs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单实体类对应d_order
 * @author AdministratorShuai
 *
 */
public class Order implements Serializable{
	//id
	private Integer id;
	//订单号
	private Integer orderId;
	//总价
	private Double total;
	//下单时间
	private Date orderDate;
	//订单状态
	private String orderState;
	//外键（地址id）
	private Address address;
	//外键（用户id）
	private User user;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer id, Integer orderId, Double total, Date orderDate,
			String orderState, Address address, User user) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.total = total;
		this.orderDate = orderDate;
		this.orderState = orderState;
		this.address = address;
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", total=" + total
				+ ", orderDate=" + orderDate + ", orderState=" + orderState
				+ ", address=" + address + ", user=" + user + "]";
	}
	
}
