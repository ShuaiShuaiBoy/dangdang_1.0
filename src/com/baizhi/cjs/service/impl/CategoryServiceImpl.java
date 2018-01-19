package com.baizhi.cjs.service.impl;

import java.util.List;

import com.baizhi.cjs.dao.CategoryDao;
import com.baizhi.cjs.entity.Category;
import com.baizhi.cjs.entity.PageBean;
import com.baizhi.cjs.service.CategoryService;
import com.baizhi.cjs.util.MyBatisUtil;

public class CategoryServiceImpl implements CategoryService {

	public List<Category> queryCategoryAll() {
		CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
		List<Category> categorys = cd.selectCategoryAll();
		if(categorys==null || categorys.size()==0){
			throw new RuntimeException("没有类别");
		}
		MyBatisUtil.close();
		return categorys;
	}

	public Category quertCategoryBook(Integer id1, Integer id2) {
		CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
		Category category = cd.selectCategoryBook(id1, id2);
		MyBatisUtil.close();
		return category;
	}

	public Category queryCategoryById(Integer id) {
		CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
		Category category = cd.selectCategoryById(id);
		MyBatisUtil.close();
		return category;
	}

	public Category queryCategoryById2(Integer id) {
		CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
		Category category = cd.selectCategoryById2(id);
		MyBatisUtil.close();
		return category;
	}

	public Category queryCategoryBookPage1(Integer id1, PageBean page) {
		if(page==null){
			page = new PageBean();
			page.setPageNo(1);
		} 
		CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
		if(cd.selectCategoryBookCount1(id1)==null){
			page.setTotalCount(0);
		}else{
			page.setTotalCount(cd.selectCategoryBookCount1(id1));
		}
		Category category = cd.selectCategoryBookPage1(id1, page);
		MyBatisUtil.close();
		return category;
	}

	public Category queryCategoryBookPage2(Integer id1, Integer id2,
			PageBean page) {
		if(page==null){
			page = new PageBean();
			page.setPageNo(1);
		}
		CategoryDao cd = (CategoryDao)MyBatisUtil.getMapper(CategoryDao.class);
		if(cd.selectCategoryBookCount2(id2)==null){
			page.setTotalCount(0);
		}else{
			page.setTotalCount(cd.selectCategoryBookCount2(id2));
		}
		Category category = cd.selectCategoryBookPage2(id1, id2, page);
		MyBatisUtil.close();
		return category;
	}

}
