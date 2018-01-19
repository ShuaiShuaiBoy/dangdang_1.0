package com.baizhi.cjs.action;

import java.util.List;

import com.baizhi.cjs.entity.Category;
import com.baizhi.cjs.entity.PageBean;
import com.baizhi.cjs.service.CategoryService;
import com.baizhi.cjs.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport{
	private List<Category> categoryList;
	//分页查询
	private Category category;
	//根据id查询子类别
	private Category category2;
	//根据id查询类别
	private Category category3;
	//一级类别
	private Integer categoryId;
	//二级类别
	private Integer categoryCid;
	private PageBean page;
	
	
	
	public PageBean getPage() {
		return page;
	}
	public void setPage(PageBean page) {
		this.page = page;
	}
	public Category getCategory3() {
		return category3;
	}
	public void setCategory3(Category category3) {
		this.category3 = category3;
	}
	public Category getCategory2() {
		return category2;
	}
	public void setCategory2(Category category2) {
		this.category2 = category2;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getCategoryCid() {
		return categoryCid;
	}
	public void setCategoryCid(Integer categoryCid) {
		this.categoryCid = categoryCid;
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	
	public String categoryList(){
		CategoryService cs = new CategoryServiceImpl();
		categoryList = cs.queryCategoryAll();
		return "success";
	}
	
	public String categoryBook(){
		CategoryService cs = new CategoryServiceImpl();
		if(page==null){
			page = new PageBean();
			page.setPageNo(1);
		}
		if(categoryCid==null){
			category = cs.queryCategoryBookPage1(categoryId, page);
		}else{
			category=cs.queryCategoryBookPage2(categoryId, categoryCid, page);
		}
		category2=cs.queryCategoryById(categoryId);
		if(categoryCid!=null){
			category3 = cs.queryCategoryById2(categoryCid);
		}
		return "success";
	}
	
	
}
