package com.baizhi.cjs.entity;

/**
 * 购物车实体类
 */
import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Cart implements Serializable {
	// 购物车项
	private Map<Integer, CartItem> items;
	// 总价
	private Double totalNumber;
	// 购买项标记
	private boolean shop;
	// 恢复项标记
	private boolean recover;

	public Cart() {
		super();
	}

	public Double getNumber() {
		totalNumber = 0.0;
		Set<Entry<Integer, CartItem>> item = items.entrySet();
		for (Entry<Integer, CartItem> entry : item) {
			if (entry.getValue().isFlag() == true) {
				totalNumber = totalNumber + entry.getValue().getPrice()
						* entry.getValue().getCount();
			}
		}
		return totalNumber;
	}

	public boolean getShopFlag() {
		int i = 0;
		Set<Entry<Integer, CartItem>> item = items.entrySet();
		for (Entry<Integer, CartItem> entry : item) {
			if (entry.getValue().isFlag() == true) {
				i++;
			}
		}
		if (i > 0) {
			shop = true;
		} else {
			shop = false;
		}
		return shop;
	}

	public boolean getRecoverFlag() {
		int i = 0;
		Set<Entry<Integer, CartItem>> item = items.entrySet();
		for (Entry<Integer, CartItem> entry : item) {
			if (entry.getValue().isFlag() == false) {
				i++;
			}
		}
		if (i > 0) {
			recover = true;
		} else {
			recover = false;
		}
		return recover;
	}

	public Cart(Map<Integer, CartItem> items, Double totalNumber, boolean shop,
			boolean recover) {
		super();
		this.items = items;
		this.totalNumber = totalNumber;
		this.shop = shop;
		this.recover = recover;
	}

	public Map<Integer, CartItem> getItems() {
		return items;
	}

	public void setItems(Map<Integer, CartItem> items) {
		this.items = items;
	}

	public Double getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Double totalNumber) {
		this.totalNumber = totalNumber;
	}

	public boolean isShop() {
		return shop;
	}

	public void setShop(boolean shop) {
		this.shop = shop;
	}

	public boolean isRecover() {
		return recover;
	}

	public void setRecover(boolean recover) {
		this.recover = recover;
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + ", totalNumber=" + totalNumber
				+ ", shop=" + shop + ", recover=" + recover + "]";
	}

}
