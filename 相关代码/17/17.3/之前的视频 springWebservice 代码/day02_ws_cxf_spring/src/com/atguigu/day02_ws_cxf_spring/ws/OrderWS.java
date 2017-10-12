package com.atguigu.day02_ws_cxf_spring.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.atguigu.day02_ws_cxf_spring.bean.Order;

@WebService
public interface OrderWS {

	@WebMethod
	public Order getOrderById(int id);
}
