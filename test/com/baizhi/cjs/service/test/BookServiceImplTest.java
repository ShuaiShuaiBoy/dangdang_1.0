package com.baizhi.cjs.service.test;

import java.util.List;

import org.junit.Test;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.service.BookService;
import com.baizhi.cjs.service.impl.BookServiceImpl;

public class BookServiceImplTest {
	
	BookService bs = new BookServiceImpl();
	
	@Test
	public void test1() {
		List<Book> list = bs.queryBookAll();
		for (Book book : list) {
			System.out.println(book);
		}
	}
	
	@Test
	public void test2(){
		List<Book> list = bs.queryBookBySales();
		for (Book book : list) {
			System.out.println(book);
		}
	}
	
	@Test
	public void test3(){
		List<Book> list = bs.queryBookState2();
		for (Book book : list) {
			System.out.println(book);
		}
	}
	
	@Test
	public void test4(){
		List<Book> list = bs.queryBookBySalesAndNewDate();
		for (Book book : list) {
			System.out.println(book);
		}
	}

}
