package com.baizhi.cjs.dao.test;

import java.util.List;

import org.junit.Test;

import com.baizhi.cjs.dao.BookDao;
import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.util.MyBatisUtil;

public class BookDaoImplTest {
	BookDao bd = (BookDao)MyBatisUtil.getMapper(BookDao.class);
	//查询所有
	@Test
	public void test1() {
		List<Book> list = bd.selectBookAll();
		for (Book book : list) {
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
	//根据id查询
	@Test
	public void test2(){
		Book book = bd.selectBookById(100);
		System.out.println(book);
		MyBatisUtil.close();
	}
	//根据销量排序查询
	@Test
	public void test3(){
		List<Book> list = bd.selectBookBySales();
		for (Book book : list) {
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
	//查询图书状态是上架的图书
	@Test
	public void test4(){
		List<Book> list = bd.selectBookByState();
		for (Book book : list) {
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
	//根据上架时间排序查询
	@Test
	public void test5(){
		List<Book> list = bd.selectBookAll();
		for (Book book : list) {
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
	//根据上架时间和销量
	@Test
	public void test6(){
		List<Book> list = bd.selectBookByNewDateAndSales();
		for (Book book : list) {
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
}
