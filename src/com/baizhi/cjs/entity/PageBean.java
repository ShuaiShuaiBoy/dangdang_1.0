package com.baizhi.cjs.entity;

import java.io.Serializable;

public class PageBean implements Serializable {
	// 页码
	private int pageNo;
	// 显示行数
	private int pageCount = 5;
	// 总行数
	private int totalCount;

	//开始
	public int getBegin(){
		return (pageNo-1)*pageCount+1;
	}
	//结束
	public int getEnd(){
		return pageNo*pageCount;
	}
	//总页数
	public int getNum(){
		return totalCount%pageCount==0?totalCount/pageCount:totalCount/pageCount+1;
	}
	
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PageBean(int pageNo, int pageCount, int totalCount) {
		super();
		this.pageNo = pageNo;
		this.pageCount = pageCount;
		this.totalCount = totalCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "PageBean [pageNo=" + pageNo + ", pageCount=" + pageCount
				+ ", totalCount=" + totalCount + "]";
	}

}
