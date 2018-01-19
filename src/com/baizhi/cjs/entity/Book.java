package com.baizhi.cjs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 图书实体类对应d_book
 * 
 * @author AdministratorShuai
 * 
 */
public class Book implements Serializable {
	// id
	private Integer id;
	// 书名
	private String bookName;
	// 作者
	private String author;
	// 出版社
	private String press;
	// 版次
	private int edition;
	// 印刷时间
	private Date printDate;
	// 印次
	private int printNumber;
	// ISBN
	private Integer isbn;
	// 字数
	private Integer wordNumber;
	// 页数
	private int pageNumber;
	// 开本
	private String style;
	// 纸张
	private String paper;
	// 包装
	private String packages;
	// 编辑推荐
	private String recommend;
	// 内容简介
	private String synopsis;
	// 作者简介
	private String auSynopsis;
	// 目录
	private String directory;
	// 媒体评论
	private String comments;
	// 库存数量
	private Integer stock;
	// 图书图片
	private String picture;
	// 书稿插画
	private String plate;
	// 上架时间
	private Date newDate;
	// 销量
	private int sales;
	// 原价
	private Double price;
	// 当当价
	private Double dPrice;
	// 图书状态
	private String state;
	// 外键（类别id）
	private Category category;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String bookName, String author, String press,
			int edition, Date printDate, int printNumber, Integer isbn,
			Integer wordNumber, int pageNumber, String style, String paper,
			String packages, String recommend, String synopsis,
			String auSynopsis, String directory, String comments,
			Integer stock, String picture, String plate, Date newDate,
			int sales, Double price, Double dPrice, String state,
			Category category) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.edition = edition;
		this.printDate = printDate;
		this.printNumber = printNumber;
		this.isbn = isbn;
		this.wordNumber = wordNumber;
		this.pageNumber = pageNumber;
		this.style = style;
		this.paper = paper;
		this.packages = packages;
		this.recommend = recommend;
		this.synopsis = synopsis;
		this.auSynopsis = auSynopsis;
		this.directory = directory;
		this.comments = comments;
		this.stock = stock;
		this.picture = picture;
		this.plate = plate;
		this.newDate = newDate;
		this.sales = sales;
		this.price = price;
		this.dPrice = dPrice;
		this.state = state;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public Date getPrintDate() {
		return printDate;
	}

	public void setPrintDate(Date printDate) {
		this.printDate = printDate;
	}

	public int getPrintNumber() {
		return printNumber;
	}

	public void setPrintNumber(int printNumber) {
		this.printNumber = printNumber;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public Integer getWordNumber() {
		return wordNumber;
	}

	public void setWordNumber(Integer wordNumber) {
		this.wordNumber = wordNumber;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getPaper() {
		return paper;
	}

	public void setPaper(String paper) {
		this.paper = paper;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getAuSynopsis() {
		return auSynopsis;
	}

	public void setAuSynopsis(String auSynopsis) {
		this.auSynopsis = auSynopsis;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Date getNewDate() {
		return newDate;
	}

	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getdPrice() {
		return dPrice;
	}

	public void setdPrice(Double dPrice) {
		this.dPrice = dPrice;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author="
				+ author + ", press=" + press + ", edition=" + edition
				+ ", printDate=" + printDate + ", printNumber=" + printNumber
				+ ", isbn=" + isbn + ", wordNumber=" + wordNumber
				+ ", pageNumber=" + pageNumber + ", style=" + style
				+ ", paper=" + paper + ", packages=" + packages
				+ ", recommend=" + recommend + ", synopsis=" + synopsis
				+ ", auSynopsis=" + auSynopsis + ", directory=" + directory
				+ ", comments=" + comments + ", stock=" + stock + ", picture="
				+ picture + ", plate=" + plate + ", newDate=" + newDate
				+ ", sales=" + sales + ", price=" + price + ", dPrice="
				+ dPrice + ", state=" + state + ", category=" + category + "]";
	}

}
