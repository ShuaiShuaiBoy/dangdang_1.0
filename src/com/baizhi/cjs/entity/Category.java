package com.baizhi.cjs.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 类别实体类对应d_category
 * @author AdministratorShuai
 *
 */
public class Category implements Serializable{
	//id
	private Integer id;
	//类别名
	private String name;
	//类别级别
	private int cLevel;
	//图书数量
	private int bookNumber;
	//集合保存子id
	private List<Category> categorys=new ArrayList<Category>();
	//图书集合
	private List<Book> books = new ArrayList<Book>();
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer id, String name, int cLevel, int bookNumber,
			List<Category> categorys, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.cLevel = cLevel;
		this.bookNumber = bookNumber;
		this.categorys = categorys;
		this.books = books;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getcLevel() {
		return cLevel;
	}
	public void setcLevel(int cLevel) {
		this.cLevel = cLevel;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public List<Category> getCategorys() {
		return categorys;
	}
	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", cLevel=" + cLevel
				+ ", bookNumber=" + bookNumber + ", categorys=" + categorys
				+ ", books=" + books + "]";
	}
	
}
