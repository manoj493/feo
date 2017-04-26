package com.bbb.dao;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bbb.domain.Inventory;

public interface InventoryDao extends CrudRepository<Inventory, String> {

	@Query("Select * from inventory where skuId=?0")
	public Inventory findBySkuId(String skuId);
	
}
