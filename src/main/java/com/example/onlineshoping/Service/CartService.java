package com.example.onlineshoping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshoping.entity.cart;
import com.example.onlineshoping.repository.CartRepository;
@Service
public class CartService {

	@Autowired
	private CartRepository cartrepository;
	public cart addcart(cart crt) 
	{
		return cartrepository.save(crt);
	}
	public List<cart> findAllElement()
	{
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
	
}
