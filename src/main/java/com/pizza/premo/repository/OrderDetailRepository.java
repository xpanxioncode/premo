package com.pizza.premo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.premo.model.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
	
	//query for who and what time the order was placed.
//	@Query("SELECT employee.id, name , orderdetail.id, products, date"
//			+ "FROM orderdetail"
//			+ "JOIN employee ON employeeid = employee.id"
//			+ "ORDER BY DATE_PART('week', date);")
//	List <OrderDetail> get();
	
}
