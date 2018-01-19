package com.baizhi.cjs.entity;
/**
 * 购物车项实体类
 */
import java.io.Serializable;

public class CartItem implements Serializable {
	// 商品名
	private String goodsName;
	// 市场价
	private Double price;
	// 当当价
	private Double dPrice;
	// 数量
	private int count;
	// 是否删除
	private boolean flag=true;

	
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	//小计
	public double getSum(){
		return price*count;
	}
	public CartItem(String goodsName, Double price, Double dPrice, int count,
			boolean flag) {
		super();
		this.goodsName = goodsName;
		this.price = price;
		this.dPrice = dPrice;
		this.count = count;
		this.flag = flag;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "CartItem [goodsName=" + goodsName + ", price=" + price
				+ ", dPrice=" + dPrice + ", count=" + count + ", flag=" + flag
				+ "]";
	}

}
