package com.bbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbb.manager.InventoryManager;
import com.bbb.vo.InventoryVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "InventoryService")
public class InventoryController {

	@Autowired
	InventoryManager inventoryManager;

	@RequestMapping(value = "/inventory/{skuId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Get the Inventory of a sku")
	public InventoryVO getInventory(@ApiParam(name = "skuId", value = "Sku Id") @PathVariable String skuId) {
		return inventoryManager.findInventoryBySite(skuId);
	}

}
