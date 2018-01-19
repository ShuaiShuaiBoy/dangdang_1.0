package com.baizhi.cjs.dao.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.baizhi.cjs.dao.CategoryDao;
import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.entity.Category;
import com.baizhi.cjs.entity.PageBean;
import com.baizhi.cjs.util.MyBatisUtil;

public class CategoryDaoImplTest {
	private static Logger log = Logger.getLogger(CategoryDaoImplTest.class);
	CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
	@Test
	public void test1() {
		List<Category> categorys=cd.selectCategoryAll();
		for (Category category : categorys) {
			System.out.println(category);
			for(Category category2 : category.getCategorys()){
				System.out.println(category2);
			}
		}
		MyBatisUtil.close();
	}
	
	@Test
	public void test2(){
		Category category = cd.selectCategoryBook(1, 9);
		for(Book book:category.getBooks()){
			System.out.println(book);
		}
		for(Category category1:category.getCategorys()){
			System.out.println(category1);
		}
		MyBatisUtil.close();
	}
	
	@Test
	public void test3(){
		Category category = cd.selectCategoryById(8);
		for(Category c:category.getCategorys()){
			System.out.println(c);
		}
		MyBatisUtil.close();
	}
	
	@Test
	public void test4(){
		Category category = cd.selectCategoryById2(8);
		System.out.println(category);
		MyBatisUtil.close();
	}
	//分页测试1
	@Test
	public void test5(){
		PageBean page = new PageBean();
		page.setPageNo(4);
		page.setTotalCount(cd.selectCategoryBookCount1(1));
		Category category = cd.selectCategoryBookPage1(1,page);
		for(Book book:category.getBooks()){
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
	//分页测试2
	@Test
	public void test6(){
		PageBean page = new PageBean();
		page.setPageNo(2);
		page.setTotalCount(cd.selectCategoryBookCount2(8));
		Category category = cd.selectCategoryBookPage2(1, 8, page);
		for(Book book:category.getBooks()){
			System.out.println(book);
		}
		MyBatisUtil.close();
	}
	//测试总行数
	@Test
	public void test7(){
		Integer r1 = cd.selectCategoryBookCount1(2);
		Integer r2 = cd.selectCategoryBookCount2(8);
		log.info("r1值为：" + r1);
		log.info("r2值为："+r2);
		MyBatisUtil.close();
	}
}
