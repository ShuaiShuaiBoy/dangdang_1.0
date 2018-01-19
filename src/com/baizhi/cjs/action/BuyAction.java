package com.baizhi.cjs.action;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.baizhi.cjs.entity.Address;
import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.entity.Cart;
import com.baizhi.cjs.entity.CartItem;
import com.baizhi.cjs.entity.Order;
import com.baizhi.cjs.entity.OrderItem;
import com.baizhi.cjs.entity.User;
import com.baizhi.cjs.service.AddressService;
import com.baizhi.cjs.service.BookService;
import com.baizhi.cjs.service.OrderItemService;
import com.baizhi.cjs.service.OrderService;
import com.baizhi.cjs.service.impl.AddressServiceImpl;
import com.baizhi.cjs.service.impl.BookServiceImpl;
import com.baizhi.cjs.service.impl.OrderItemServiceImpl;
import com.baizhi.cjs.service.impl.OrderServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class BuyAction extends ActionSupport {
	private Address address;
	private Integer orderId;
	private Double sumber;

	public Double getSumber() {
		return sumber;
	}

	public void setSumber(Double sumber) {
		this.sumber = sumber;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String buyShop(){
		//获取两个session对象
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		Cart cart = (Cart)session.getAttribute("cart");
		address.setUser(user);
		//保存地址
		AddressService as = new AddressServiceImpl();
		if(as.queryAddressByName(address.getRecName())==null){
			as.saveAddress(address);
		}else{
			address = as.queryAddressByName(address.getRecName());
			address.setRecName(address.getRecName());
			address.setPostCode(address.getPostCode());
			address.setTelphone(address.getTelphone());
			address.setMobile(address.getMobile());
			as.changeAddress(address);
		}
		//保存订单
		OrderService os = new OrderServiceImpl();
		Order order = new Order();
		order.setOrderId(100);
		order.setAddress(as.queryAddressByName(address.getRecName()));
		order.setUser(user);
		order.setOrderDate(new Date());
		order.setOrderState("f");
		order.setTotal(cart.getTotalNumber());
		os.saveOrder(order);
		orderId=order.getId();
		//保存订单项
		OrderItemService ois = new OrderItemServiceImpl();
		BookService bs = new BookServiceImpl();
		OrderItem orderItem = null;
		Book book = null;
		Map<Integer,CartItem> cartItems = cart.getItems();
		Set<Entry<Integer,CartItem>> set =  cartItems.entrySet();
		for (Entry<Integer, CartItem> entry : set) {
			orderItem = new OrderItem();
			book = bs.queryBookById(entry.getKey());
			orderItem.setBook(book);
			orderItem.setCount(entry.getValue().getCount());
			orderItem.setItemId(1);
			orderItem.setOrder(order);
			orderItem.setSummary(entry.getValue().getPrice()*entry.getValue().getCount());
			ois.saveOrderItem(orderItem);
		}
		sumber = cart.getNumber();
		session.removeAttribute("cart");
		
		return "success";
	}
}
