package com.example.onlineshoping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshoping.entity.CartItems;
import com.example.onlineshoping.repository.CartItemRepository;
@Service
public class CartItemService {

	@Autowired
	private  CartItemRepository cartitemrepository;
	
	public CartItems addcartitem(CartItems crt) {
		return cartitemrepository.save(crt);
	}
	public  List<CartItems> finadAllElement() 
	{
		return cartitemrepository.findAll();
	}
	public CartItems getCartItems(long id) {
		return cartitemrepository.findById(id).get();
	}
	public CartItems updateCartItems(CartItems crt) {
		return cartitemrepository.save(crt);
	}
	
	public void deletCartItemsById(long id)
	{
		cartitemrepository.deleteById(id);
	}
	
}
