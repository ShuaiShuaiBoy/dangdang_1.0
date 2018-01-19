package com.baizhi.cjs.entity;
/**
 * d_orderitem的实体类
 */
import java.io.Serializable;

public class OrderItem implements Serializable{
	private Integer id;
	private Integer itemId;
	private int count;
	private Double summary;
	private Book book;
	private Order order;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(Integer id, Integer itemId, int count, Double summary,
			Book book, Order order) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.count = count;
		this.summary = summary;
		this.book = book;
		this.order = order;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Double getSummary() {
		return summary;
	}
	public void setSummary(Double summary) {
		this.summary = summary;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", itemId=" + itemId + ", count="
				+ count + ", summary=" + summary + ", book=" + book
				+ ", order=" + order + "]";
	}
	
}
