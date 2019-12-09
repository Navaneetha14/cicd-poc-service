package com.cicd.cicdpocservice;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
	@GetMapping("/product")
	public Product getProductById()
	{
		i=0;
		while(i<10)
		{
		i=i-1;
		}
		
		Product product = new Product();
		
		productMapper(product);
	
		return product; 
	}
	
	@GetMapping("/product/getOne")
	public Product getProduct()
	{
		Product product = new Product();
		
		productMapper(product);
	
		return product; 
	}

	private void productMapper(Product product) 
	{
		product.setId(1);
		product.setName("Product Name");
		product.setPrice(new BigDecimal("10"));
		product.setExpiryDate1(new Date());
		product.setExpiryDate2(new Date());
		product.setBrand("Product Brand");
		product.setQuantityForExpiryDate1(2);
		product.setQuantityForExpiryDate2(3);
		product.setWeight(12.22f);
	 }
	
	

}
