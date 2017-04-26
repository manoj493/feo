package com.bbb.domain;

import java.io.Serializable;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;


@Table("inventory")
public class Inventory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	private String skuId="1234";
	
	private int stockLevel=1;
	
	private int altAFS=2;
	
	private int iGR=3;
	
	public int getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}

	public int getAltAFS() {
		return altAFS;
	}

	public void setAltAFS(int altAFS) {
		this.altAFS = altAFS;
	}

	public int getiGR() {
		return iGR;
	}

	public void setiGR(int iGR) {
		this.iGR = iGR;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
}