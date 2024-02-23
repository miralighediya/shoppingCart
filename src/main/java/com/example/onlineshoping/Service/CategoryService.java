package com.example.onlineshoping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshoping.entity.category;
import com.example.onlineshoping.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public category addCategory(category cat)
	{
		return categoryRepository.save(cat);
	}

	public  List<category> finadAllElement() 
	{
		return categoryRepository.findAll();
	}
	public category getCategory(Long id)
	{
		return categoryRepository.findById(id).get();
	}

	public category updateCategory(category cat)
	{
		return categoryRepository.save(cat);
	}
	
	public void deleteCategoryById(long id)
	{
		 categoryRepository.deleteById(id);
	}

	

}
