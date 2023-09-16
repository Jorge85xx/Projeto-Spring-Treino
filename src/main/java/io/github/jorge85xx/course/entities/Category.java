package io.github.jorge85xx.course.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "tb_category")
public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;
	
	@JsonIgnore
	@Setter(AccessLevel.NONE)
	@ManyToMany(mappedBy = "categories")
	private Set<Product> products = new HashSet<>();
	
	
	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}


	public Category() {
	}
	
	
	
}
