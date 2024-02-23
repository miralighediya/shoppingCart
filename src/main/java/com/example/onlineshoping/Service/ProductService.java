
package com.example.onlineshoping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshoping.entity.product;
import com.example.onlineshoping.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public product addproduct(product prd) 
	{
		return productRepository.save(prd);
	}
	
	public List<product> finadAllElement()
	{
		return productRepository.findAll();
	}
	
	public product getProduct(Long id)
	{
		return productRepository.findById(id).get();
	}
	public product updateProduct(product prd)
	{
		return productRepository.save(prd);
	}
	
	public void deleteProductById(long id)
	{
		productRepository.deleteById(id);
	}
}
