package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.pojo.User;

public interface OrderService {

	
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
	Order getOrder(String orderId);
	void addOrder(Order order);
}
