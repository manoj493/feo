package com.bbb.manager;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbb.dao.InventoryDao;
import com.bbb.domain.Inventory;
import com.bbb.vo.InventoryVO;

@Component
public class InventoryManager {

	@Autowired
	InventoryDao inventoryDao;

	public InventoryVO findInventoryBySite(String skuId) {
		Inventory inv = inventoryDao.findBySkuId(skuId);
		InventoryVO invVo = new InventoryVO();
		invVo.setSkuId(skuId);
		invVo.setStockLevel(inv.getStockLevel());
		invVo.setAltAFS(inv.getAltAFS());
		invVo.setiGR(inv.getiGR());
		return invVo;
	}
	
	@PostConstruct
	public void init() {
		this.inventoryDao.deleteAll();

		// save a couple of customers
		this.inventoryDao.save(new Inventory("123", 1,2,3));
		this.inventoryDao.save(new Inventory("456", 4,5,6));
		this.inventoryDao.save(new Inventory("789", 7,8,9));
	}
}
