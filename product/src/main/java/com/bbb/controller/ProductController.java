package com.bbb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbb.manager.ProductManager;
import com.bbb.vo.ProductVO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class ProductController {

	@Autowired
	ProductManager productManager;

	@RequestMapping(value = "/product/{productId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Get the Inventory of a sku")
	public ProductVO getInventory(@ApiParam(name = "productId", value = "Sku Id") @PathVariable int productId) {
		return productManager.findProductBySite(productId);
	}

	
}
