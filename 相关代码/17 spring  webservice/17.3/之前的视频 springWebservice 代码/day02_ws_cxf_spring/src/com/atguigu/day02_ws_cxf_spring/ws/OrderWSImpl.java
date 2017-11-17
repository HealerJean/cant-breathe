package com.atguigu.day02_ws_cxf_spring.ws;

import javax.jws.WebService;

import com.atguigu.day02_ws_cxf_spring.bean.Order;

@WebService
public class OrderWSImpl implements OrderWS {

	
	public OrderWSImpl()  {
		System.out.println("OrderWSImpl()");
	}
	
	@Override
	public Order getOrderById(int id) {
		System.out.println("server getOrderById() "+id);
		return new Order(id, "飞机", 10000000);
	}

}
