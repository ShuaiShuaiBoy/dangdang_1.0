package com.baizhi.cjs.dao;

import java.util.List;

import com.baizhi.cjs.entity.Book;

/**
 * Book的dao
 * 
 * @author AdministratorShuai
 *
 */
public interface BookDao {
	//查询所有的图书
	public List<Book> selectBookAll();
	//根据id查询
	public Book selectBookById(Integer id);
	//根据销量排序查询
	public List<Book> selectBookBySales();
	//查询图书状态是上架的图书
	public List<Book> selectBookByState();
	//根据上架时间排序查询
	public List<Book> selectBookByNewDate();
	//查询图书状态是推荐的图书
	public List<Book> selectBookByState2();
	//根据销量&上架时间排序
	public List<Book> selectBookByNewDateAndSales();
}
