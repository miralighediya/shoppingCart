package com.example.onlineshoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshoping.Service.CartItemService;
import com.example.onlineshoping.Service.CartService;
import com.example.onlineshoping.entity.AddToCartRequest;
import com.example.onlineshoping.entity.CartItems;
import com.example.onlineshoping.entity.cart;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private CartItemService cartItemService;

	@PostMapping("/{mobileNumber}/add")
	public ResponseEntity<String> addToCart(@PathVariable String mobileNumber, @RequestBody AddToCartRequest request) {
		cartService.addToCart(mobileNumber, request);
		return ResponseEntity.ok("Product added to the cart successfully.");
	}

	@GetMapping("/{mobileNumber}")
	public List<CartItems> getcarthigher() {
		List<CartItems> crtList = cartItemService.finadAllElement();
		System.out.println(crtList.toString());
		return crtList;
	}

	@PutMapping("/{mobileNumber}/update")
	public cart updatecart(@RequestBody cart crt) {
		return cartService.updatecart(crt);
	}

	@DeleteMapping("/clear")
	public void deletecartById(@PathVariable int id) {
		cartService.deleteCartById(id);
		System.out.println("record deleted succefully");
	}

}
