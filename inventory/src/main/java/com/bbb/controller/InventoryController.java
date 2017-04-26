package com.bbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbb.manager.InventoryManager;
import com.bbb.vo.InventoryVO;

@RestController
public class InventoryController {

	@Autowired InventoryManager inventoryManager;
	
	@RequestMapping(value="/inventory/{skuId}", method=RequestMethod.GET)
	public InventoryVO getInventory(@PathVariable String skuId){
		return inventoryManager.findInventoryBySite(skuId);
	}
	
	
}
