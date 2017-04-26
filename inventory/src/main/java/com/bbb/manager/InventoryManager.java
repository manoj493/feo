package com.bbb.manager;

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
}
