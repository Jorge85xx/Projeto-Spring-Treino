package io.github.jorge85xx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.jorge85xx.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
