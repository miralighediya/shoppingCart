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

import com.example.onlineshoping.Service.CategoryService;
import com.example.onlineshoping.entity.category;

@RestController
@RequestMapping("/categories")

public class CategoryController {
	
	@Autowired
	private CategoryService categoryservice;

	@PostMapping("/add")
	public category addcategory(@RequestBody category cat) {
		return categoryservice.addCategory(cat);
	}
	
	@GetMapping("/list")
	public List<category> getcategoryHigher()
	{
		List<category> catList = categoryservice.finadAllElement();
		System.out.println(catList.toString());
		return catList;
	}
	@GetMapping("/{id}")
	public category get(@PathVariable("id") long id)
	{
		category ca = categoryservice.getCategory(id);
		System.out.println(ca.toString());
		return ca;
	}
	
	@PutMapping("/update")
	public category updatecategory(@RequestBody category cat)
	{
		return categoryservice.updateCategory(cat);
	}
	
	@DeleteMapping("/delete/{id}")
	public void  deletecategoryById(@PathVariable int id)
	{
		categoryservice.deleteCategoryById(id);
	}

}
