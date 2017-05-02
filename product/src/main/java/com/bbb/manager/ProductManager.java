package com.bbb.manager;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bbb.dao.ProductDao;
import com.bbb.domain.Product;
import com.bbb.vo.ProductVO;

@Component
public class ProductManager {

	@Autowired
	ProductDao productDao;

	public ProductVO findProductBySite(int productId) {
		Product prod = productDao.findByProductId(productId);
		ProductVO prodVo = new ProductVO();
		prodVo.setProductId(prod.getProductId());
		prodVo.setName(prod.getName());
		prodVo.setDesc(prod.getDescription());
		return prodVo;
	}
	
	@PostConstruct
	public void init() {
		this.productDao.deleteAll();

		// save a couple of customers
		this.productDao.save(new Product(123, "123-title", "123-desc"));
		this.productDao.save(new Product(456, "456-title", "456-desc"));
		this.productDao.save(new Product(789, "789-title", "798-desc"));
	}
}
