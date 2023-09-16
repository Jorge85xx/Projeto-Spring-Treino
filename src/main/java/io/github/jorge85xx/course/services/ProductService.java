package io.github.jorge85xx.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.jorge85xx.course.entities.Product;
import io.github.jorge85xx.course.entities.User;
import io.github.jorge85xx.course.repositories.ProductRepository;

@Service //ou @component p mostrar que é um componente
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
}
