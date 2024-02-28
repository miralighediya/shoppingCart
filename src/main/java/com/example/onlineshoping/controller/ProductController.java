package com.example.onlineshoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshoping.Service.ProductService;
import com.example.onlineshoping.entity.product;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	//not required
	@GetMapping("/list")
	public List<product> getproductHigher()
	{
		List<product> prdList = productservice.finadAllElement();
		System.out.println(prdList.toString());
		return prdList;
	}
	
	@GetMapping("/{id}")
	public product get(@PathVariable("id")Long id)
	{
		product pr =productservice.getProduct(id);
		System.out.println(pr.toString());
		return pr;
	}
	
	@PostMapping("/add")
	public product addproduct(@RequestBody product prd)
	{
		return productservice.addproduct(prd);
	}
	
	@PutMapping("/update/{id}")
	public product updateproduct(@PathVariable("id") Long productId, @RequestBody product productDetails)
	{
		product updatedProduct = productservice.updateProduct(productId, productDetails);
		if (updatedProduct != null) {
			return updatedProduct;
		} else {
			return null;
		}
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteproductById(@PathVariable int id)
	{
		productservice.deleteProductById(id);
		System.out.println(" record deleted succefully");
	}

}
