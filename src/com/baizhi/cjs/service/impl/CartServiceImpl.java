package com.baizhi.cjs.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.entity.Cart;
import com.baizhi.cjs.entity.CartItem;
import com.baizhi.cjs.service.CartService;

public class CartServiceImpl implements CartService {
	public void saveCart(Book book) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session =request.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		if(cart==null){
			cart = new Cart();
		}
		Map<Integer,CartItem> items = cart.getItems();
		if(items==null){
			items = new HashMap<Integer,CartItem>();
		}
		CartItem item = items.get(book.getId());
		if(item==null){
			item = new CartItem();
			item.setGoodsName(book.getBookName());
			item.setPrice(book.getPrice());
			item.setdPrice(book.getdPrice());
			item.setCount(1);
			items.put(book.getId(), item);
			cart.setItems(items);
		}else{
			item.setGoodsName(book.getBookName());
			item.setPrice(book.getPrice());
			item.setdPrice(book.getdPrice());
			item.setCount(item.getCount()+1);
			items.put(book.getId(), item);
		}
		session.setAttribute("cart", cart);
	}

	public void changeCart(Book book, int count) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session =request.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		Map<Integer ,CartItem> items = cart.getItems();
		CartItem item = items.get(book.getId());
		item.setCount(count);
		items.put(book.getId(), item);
		session.setAttribute("cart", cart);
	}

	public void changeCartItem(Book book, boolean flag) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session =request.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		Map<Integer,CartItem> items = cart.getItems();
		CartItem item = items.get(book.getId());
		item.setFlag(flag);
		items.put(book.getId(), item);
		session.setAttribute("cart", cart);
	}
	public CartItem queryCartItemById(Book book) {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session =request.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		Map<Integer,CartItem> items = cart.getItems();
		return items.get(book.getId());
	}

}
