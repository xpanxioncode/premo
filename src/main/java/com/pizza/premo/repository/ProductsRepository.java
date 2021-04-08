package com.pizza.premo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.premo.model.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

}
