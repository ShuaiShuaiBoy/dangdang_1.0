package com.baizhi.cjs.service;

import com.baizhi.cjs.entity.Book;
import com.baizhi.cjs.entity.Cart;
import com.baizhi.cjs.entity.CartItem;

public interface CartService {
	//添加到购物车
	public void saveCart(Book book);
	//变更购物车项数量
	public void changeCart(Book book,int count);
	//修改购物车项状态
	public void changeCartItem(Book book,boolean flag);
	//根据id查询购物车项
	public CartItem queryCartItemById(Book book);
	
}
