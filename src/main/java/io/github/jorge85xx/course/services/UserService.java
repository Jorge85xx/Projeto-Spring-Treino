package io.github.jorge85xx.course.services;

import java.util.List;
import java.util.Optional;

import io.github.jorge85xx.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.jorge85xx.course.entities.User;
import io.github.jorge85xx.course.repositories.UserRepository;

@Service //ou @component p mostrar que é um componente
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() ->  new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);;
	}
	
	public User update (Long id, User obj) {
		User entity = userRepository.getReferenceById(id); //prepara o objeto para mexer
		updateData(entity, obj);
		return userRepository.save(entity);
		
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
