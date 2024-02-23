package com.example.onlineshoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineshoping.Service.CartItemService;
import com.example.onlineshoping.entity.CartItems;

@RestController
@RequestMapping("/cartitem")
public class CartItemController {

	@Autowired
	private CartItemService cartitemservice;
	@PostMapping("/add")
		public CartItems addcartitem(@RequestBody CartItems crt)
	{
		return cartitemservice.addcartitem(crt);
	}
	@GetMapping("/list")
	public List<CartItems> getcartitemHigher()
	{
		List<CartItems> crtList = cartitemservice.finadAllElement();
		System.out.println(crtList.toString());
		return crtList;
	}
	@GetMapping("/{id}")
	public CartItems get(@PathVariable("id") long id)
	{
		CartItems ca = cartitemservice.getCartItems(id);
		System.out.println(ca.toString());
		return ca;
	}
	@PutMapping("/update")
	public CartItems updateCartItems(@RequestBody CartItems crt)
	{
		return cartitemservice.updateCartItems(crt);
	}
	@PutMapping("/delete/{id}")
	public void deleteCartById(@PathVariable int id)
	{
		cartitemservice.deletCartItemsById(id);
	}
	
}
