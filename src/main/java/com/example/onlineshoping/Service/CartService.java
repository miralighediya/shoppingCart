package com.example.onlineshoping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshoping.entity.AddToCartRequest;
import com.example.onlineshoping.entity.CartItems;
import com.example.onlineshoping.entity.cart;
import com.example.onlineshoping.entity.product;
import com.example.onlineshoping.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartrepository;

	@Autowired
	private ProductService productService;

	public cart addcart(cart crt) {
		return cartrepository.save(crt);
	}

	public List<cart> findAllElement() {
		return cartrepository.findAll();
	}

	public cart updatecart(cart crt) {
		return cartrepository.save(crt);
	}

	public void deleteCartById(long id) {

		cartrepository.deleteById(id);
	}

	public cart getCart(long id) {
		return cartrepository.findById(id).get();
	}

	public void addToCart(String mobileNumber, AddToCartRequest request) {
		// Fetch cart by mobile number or create a new one if not exists
		cart cart = cartrepository.findBymobilenumber(mobileNumber);
		if (cart == null) {
			cart = new cart();
			cart.setCustomer_mobile_number(mobileNumber);
		}

		// Fetch product by ID
		product product = productService.getProduct(request.getProductId());

		// Create cart item and add to cart
		CartItems cartItem = new CartItems();
		cartItem.setProduct_id(product);

		cart.addItem(cartItem);

		// Update or save the cart
		cartrepository.save(cart);
	}

}
