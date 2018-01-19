package com.baizhi.cjs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.cjs.entity.Category;
import com.baizhi.cjs.entity.PageBean;

/**
 * Category的dao
 * @author AdministratorShuai
 *
 */
public interface CategoryDao {
	//查询所有类别
	public List<Category> selectCategoryAll();
	//根据类别查询图书
	public Category selectCategoryBook(@Param("id")Integer id1,@Param("cid")Integer id2);
	//根据id查询所有子类别
	public Category selectCategoryById(Integer id);
	//根据id查询类别
	public Category selectCategoryById2(Integer id);
	//根据一级类别分页查询图书
	public Category selectCategoryBookPage1(@Param("id1")Integer id1,@Param("page")PageBean pageBaen);
	//根据一级类别查询图书总数
	public Integer selectCategoryBookCount1(Integer id1);
	//根据二级类别分页查询图书
	public Category selectCategoryBookPage2(@Param("id1")Integer id1,@Param("id2")Integer id2,@Param("page")PageBean pageBaen);
	//根据二级类别查询图书总数
	public Integer selectCategoryBookCount2(Integer id2);
}
