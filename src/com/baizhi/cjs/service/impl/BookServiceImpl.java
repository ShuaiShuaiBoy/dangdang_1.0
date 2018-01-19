package com.baizhi.cjs.service.impl;

import java.util.List;

import com.baizhi.cjs.dao.BookDao;
import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.service.BookService;
import com.baizhi.cjs.util.MyBatisUtil;

public class BookServiceImpl implements BookService {

	public List<Book> queryBookByState() {
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> books = bd.selectBookByState();
		if(books==null || books.size()==0){
			throw new RuntimeException("没有图书！");
		}
		MyBatisUtil.close();
		return books;
	}

	public Book queryBookById(Integer id) {
		if(id==null){
			throw new RuntimeException("格式错误");
		}
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		Book book = bd.selectBookById(id);
		if(book==null){
			throw new RuntimeException("没有此图书");
		}
		MyBatisUtil.close();
		return book;
	}

	public List<Book> queryBookBySales() {
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> books = bd.selectBookBySales();
		if(books==null || books.size()==0){
			throw new RuntimeException("没有图书！");
		}
		MyBatisUtil.close();
		return books;
	}

	public List<Book> queryBookByNewDate() {
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> books = bd.selectBookByNewDate();
		if(books==null || books.size()==0){
			throw new RuntimeException("没有图书！");
		}
		MyBatisUtil.close();
		return books;
	}

	public List<Book> queryBookAll() {
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> books = bd.selectBookAll();
		if(books==null || books.size()==0){
			throw new RuntimeException("没有图书！");
		}
		MyBatisUtil.close();
		return books;
	}

	public List<Book> queryBookState2() {
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> books = bd.selectBookByState2();
		if(books==null || books.size()==0){
			throw new RuntimeException("没有图书！");
		}
		MyBatisUtil.close();
		return books;
	}

	public List<Book> queryBookBySalesAndNewDate() {
		BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
		List<Book> books = bd.selectBookByNewDateAndSales();
		if(books==null || books.size()==0){
			throw new RuntimeException("没有图书");
		}
		MyBatisUtil.close();
		return books;
	}

}
