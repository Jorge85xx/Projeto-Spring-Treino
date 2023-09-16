package io.github.jorge85xx.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.jorge85xx.course.entities.Category;
import io.github.jorge85xx.course.services.CategoryService;

@RestController
@RequestMapping(value = "categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categorias =  categoryService.findAll();
		return ResponseEntity.ok().body(categorias);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable long id){
		Category categoria = categoryService.findById(id);
		return ResponseEntity.ok().body(categoria);
	}

}
