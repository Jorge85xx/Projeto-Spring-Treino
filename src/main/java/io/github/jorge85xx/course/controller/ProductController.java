package io.github.jorge85xx.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.jorge85xx.course.entities.Category;
import io.github.jorge85xx.course.entities.Product;
import io.github.jorge85xx.course.services.ProductService;

@RestController
@RequestMapping(value = "products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> products =  productService.findAll();
		return ResponseEntity.ok().body(products);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable long id){
		Product product = productService.findById(id);
		return ResponseEntity.ok().body(product);
	}

}
