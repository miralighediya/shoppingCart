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
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@PostMapping("/add")
	public product addproduct(@RequestBody product prd)
	{
		return productservice.addproduct(prd);
	}
	
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
	@PutMapping("/update")
	public product updateproduct(@RequestBody product prd)
	{
		return productservice.updateProduct(prd);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteproductById(@PathVariable int id)
	{
		productservice.deleteProductById(id);
		System.out.println(" record deleted succefully");
	}

}
