package com.baizhi.cjs.service;

import java.util.List;

import com.baizhi.cjs.entity.Book;

/**
 * Book的业务
 * @author AdministratorShuai
 *
 */
public interface BookService {
	//查询所有上架的图书
	public List<Book> queryBookByState();
	//根据id查询图书
	public Book queryBookById(Integer id);
	//根据销量排序查询
	public List<Book> queryBookBySales();
	//上架时间排序查询
	public List<Book> queryBookByNewDate();
	//查询所有图书
	public List<Book> queryBookAll();
	//查询图书状态是推荐的图书
	public List<Book> queryBookState2();
	//根据销量&上架时间排序
	public List<Book> queryBookBySalesAndNewDate();
}
