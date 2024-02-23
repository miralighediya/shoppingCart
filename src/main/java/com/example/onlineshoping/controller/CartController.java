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

import com.example.onlineshoping.Service.CartService;
import com.example.onlineshoping.entity.cart;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/add")
	public cart addcart(@RequestBody cart crt)
	{
		return cartService.addcart(crt);
	}
	
	@GetMapping("/list")
	public List<cart> getcarthigher()
	{
		List<cart> crtList =cartService.findAllElement();
		System.out.println(crtList.toString());
		return crtList;	
	}
	@PutMapping("/update")
	public  cart updatecart(@RequestBody cart crt)
	{
		return cartService.updatecart(crt);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletecartById(@PathVariable int id)
	{
		cartService.deleteCartById(id);
		System.out.println("record deleted succefully");
	}
	
	@GetMapping("/{id}")
	public cart get(@PathVariable("id") long id)
	{
		cart cr = cartService.getCart(id);
		System.out.println(cr.toString());
		return cr;
	}
	
}
