package com.baizhi.cjs.service.test;

import org.junit.Test;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.service.BookService;
import com.baizhi.cjs.service.CartService;
import com.baizhi.cjs.service.impl.BookServiceImpl;
import com.baizhi.cjs.service.impl.CartServiceImpl;

public class CartServiceImplTest {
	BookService bs = new BookServiceImpl();
	CartService cs = new CartServiceImpl();
	
	@Test
	public void test1() {
		Book book = bs.queryBookById(13);
		Book book1 = bs.queryBookById(12);
		Book book2 = bs.queryBookById(14);
		cs.saveCart(book);
		cs.saveCart(book1);
		cs.saveCart(book2);
		cs.changeCart(book1, 10);
		cs.changeCartItem(book2, false);
	}

}
