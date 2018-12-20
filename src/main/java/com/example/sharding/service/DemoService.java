package com.example.sharding.service;

import javax.annotation.Resource;

import com.example.sharding.entity.Order;
import org.springframework.stereotype.Service;

import com.example.sharding.mapper.OrderMapper;

@Service
public class DemoService {

	@Resource
	private OrderMapper orderRepository;

	public void demo() {
		for (int i = 0; i < 10; i++) {
			Order order = new Order();
			order.setOrderId(i);
			order.setUserId(55);
			order.setStatus("Tinko");
			orderRepository.insert(order);
		}
		System.out.println("Insert Success");
	}
}