package com.bbb.dao;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bbb.domain.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

	@Query("Select * from product where productId=?0")
	public Product findByProductId(int productId);
	
}
