package com.baizhi.cjs.action;

import java.util.UUID;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.service.BookService;
import com.baizhi.cjs.service.CartService;
import com.baizhi.cjs.service.impl.BookServiceImpl;
import com.baizhi.cjs.service.impl.CartServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport{
	private Book book;
	private int count;
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	//添加到购物车
	public String saveCartItem(){
		CartService cs = new CartServiceImpl();
		BookService bs = new BookServiceImpl();
		book = bs.queryBookById(book.getId());
		cs.saveCart(book);
		return "success";
	}
	//修改购物车项状态false
	public String changeCartItemFalse(){
		CartService cs = new CartServiceImpl();
		BookService bs = new BookServiceImpl();
		book = bs.queryBookById(book.getId());
		cs.changeCartItem(book, false);
		return "success";
	}
	//修改购物车项状态true
	public String changeCartItemTrue(){
		CartService cs = new CartServiceImpl();
		BookService bs = new BookServiceImpl();
		book = bs.queryBookById(book.getId());
		cs.changeCartItem(book, true);
		return "success";
	}
	//修改购物车物品书数量
	public String changeCartCount(){
		CartService cs = new CartServiceImpl();
		BookService bs = new BookServiceImpl();
		book = bs.queryBookById(book.getId());
		cs.changeCart(book, count);
		return "success";
	}
	//结算的跳转
	public String totalCart(){
		return "success";
	}
}
