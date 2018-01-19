package com.baizhi.cjs.action;
/**
 * book的Action
 */
import java.util.List;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.service.BookService;
import com.baizhi.cjs.service.impl.BookServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
	private Book book;
	//推荐
	private List<Book> grooms;
	//热销
	private List<Book> fire;
	//最新
	private List<Book> newBook;
	//新书热卖
	private List<Book> newFire;
	
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public List<Book> getNewFire() {
		return newFire;
	}
	public void setNewFire(List<Book> newFire) {
		this.newFire = newFire;
	}
	public List<Book> getGrooms() {
		return grooms;
	}
	public void setGrooms(List<Book> grooms) {
		this.grooms = grooms;
	}
	public List<Book> getFire() {
		return fire;
	}
	public void setFire(List<Book> fire) {
		this.fire = fire;
	}
	public List<Book> getNewBook() {
		return newBook;
	}
	public void setNewBook(List<Book> newBook) {
		this.newBook = newBook;
	}
	
	public String bookGrooms(){
		BookService bs = new BookServiceImpl();
		grooms = bs.queryBookState2();
		return "success";
	}
	
	public String bookFire(){
		BookService bs = new BookServiceImpl();
		fire = bs.queryBookBySales();
		return "success";
	}
	
	public String bookNew(){
		BookService bs = new BookServiceImpl();
		newBook = bs.queryBookByNewDate();
		return "success";
	}
	
	public String bookNewFire(){
		BookService bs = new BookServiceImpl();
		newFire = bs.queryBookBySalesAndNewDate();
		return "success";
	}
	
	public String findBookById(){
		BookService bs = new BookServiceImpl();
		book = bs.queryBookById(book.getId());
		return "success";
	}
}
