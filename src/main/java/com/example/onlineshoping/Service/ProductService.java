
package com.example.onlineshoping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshoping.entity.category;
import com.example.onlineshoping.entity.product;
import com.example.onlineshoping.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryService categoryService;

	public product addproduct(product prd) {
		category existingCategory = categoryService.addCategory(prd.getCategory());
		prd.setCategory(existingCategory);
		return productRepository.save(prd);
	}

	public List<product> finadAllElement() {
		return productRepository.findAll();
	}

	public List<product> getProductsByCategoryId(category id) {
        return productRepository.findBycategory(id);
    }

	public product getProduct(Long id) {
		return productRepository.findById(id).get();
	}

	public product updateProduct(Long id, product prd) {
		product existingProduct = productRepository.findById(id).orElse(null);
		if (existingProduct != null) {

			if (prd.getName() != null) {
				existingProduct.setName(prd.getName());
			}
			if (prd.getDescription() != null) {
				existingProduct.setDescription(prd.getDescription());
			}
			if (prd.getPrice() != null) {
				existingProduct.setPrice(prd.getPrice());
			}
			if (prd.getQuantity_in_stock() != 0) {
				existingProduct.setQuantity_in_stock(prd.getQuantity_in_stock());
			}
			if (prd.getReserved_quantity() != 0) {
				existingProduct.setReserved_quantity(prd.getReserved_quantity());
			}
			if (prd.getCategory() != null) {
				existingProduct.setCategory(prd.getCategory());
			}
			if (prd.getBrand() != null) {
				existingProduct.setBrand(prd.getBrand());
			}
			return productRepository.save(existingProduct);
		}
		return null;
	}

	public void deleteProductById(long id) {
		productRepository.deleteById(id);
	}
}
