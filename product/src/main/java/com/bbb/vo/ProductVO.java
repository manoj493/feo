package com.bbb.vo;

import io.swagger.annotations.ApiModel;

@ApiModel(value="ProductVO object")
public class ProductVO {
	
	private int productId;
	private String name;
	private String desc;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
