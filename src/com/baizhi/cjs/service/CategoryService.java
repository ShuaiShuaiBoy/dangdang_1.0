package com.baizhi.cjs.service;

import java.util.List;

import com.baizhi.cjs.entity.Category;
import com.baizhi.cjs.entity.PageBean;

/**
 * Category的业务逻辑层
 * @author AdministratorShuai
 *
 */
public interface CategoryService {
	//查询所有类别
	public List<Category> queryCategoryAll();
	//根据类别查询图书
	public Category quertCategoryBook(Integer id1,Integer id2);
	//根据id查询子类别
	public Category queryCategoryById(Integer id);
	//根据id查询类别
	public Category queryCategoryById2(Integer id);
	//根据一级类别分页查询图书
	public Category queryCategoryBookPage1(Integer id1,PageBean page);
	//根据二级类别分页查询图书
	public Category queryCategoryBookPage2(Integer id1,Integer id2,PageBean page);
}
