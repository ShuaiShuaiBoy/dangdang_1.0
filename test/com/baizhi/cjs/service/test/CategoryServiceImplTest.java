package com.baizhi.cjs.service.test;

import java.util.List;

import org.junit.Test;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.entity.Category;
import com.baizhi.cjs.entity.PageBean;
import com.baizhi.cjs.service.CategoryService;
import com.baizhi.cjs.service.impl.CategoryServiceImpl;

public class CategoryServiceImplTest {
	CategoryService cs = new CategoryServiceImpl();
	@Test
	public void test1() {
		List<Category> list = cs.queryCategoryAll();
		for (Category category : list) {
			for (Category category2 : category.getCategorys()) {
				System.out.println(category2);
			}
		}
	}
	
	@Test
	public void test2(){
		Category category = cs.quertCategoryBook(null, 8);
		for(Book book:category.getBooks()){
			System.out.println(book);
		}
		for(Category c:category.getCategorys()){
			System.out.println(c);
		}
		System.out.println(category.getId());
	}
	@Test
	public void test3(){
		Category category = cs.queryCategoryById(1);
		for(Category c : category.getCategorys()){
			System.out.println(c);
		}
	}
	
	@Test
	public void test4(){
		Category category = cs.queryCategoryById2(8);
		System.out.println(category);
	}
	
	//测试分页1
	@Test
	public void test5(){
		PageBean page = new PageBean();
		page.setPageNo(1);
		Category category = cs.queryCategoryBookPage1(1, page);
		System.out.println(page.getNum());
		for(Book book:category.getBooks()){
			System.out.println(book);
		}
	}
	//测试分页2
	@Test
	public void test6(){
		PageBean page = new PageBean();
		page.setPageNo(2);
		Category category = cs.queryCategoryBookPage2(1,8, page);
		System.out.println(page.getNum());
		for(Book book:category.getBooks()){
			System.out.println(book);
		}
	}
}
