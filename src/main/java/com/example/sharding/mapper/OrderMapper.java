package com.example.sharding.mapper;

import com.example.sharding.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

	Long insert(Order order);
}