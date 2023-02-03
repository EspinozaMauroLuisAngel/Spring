package edu.mx.utvt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.mx.utvt.data.entities.User;
import edu.mx.utvt.data.repositories.UserRepository;

@SpringBootTest
public class UserTest {
	@Autowired
	private UserRepository userRepository;
	
	@Test 
	public void crearUser() {
		User user =new User ("Juan","123");
		this.userRepository.saveAndFlush(user);
	}
	
	@Test 
	public void actualizarUser(){
		User user = this.userRepository.findById(1L).orElse(null);
		if(user!=null) {}
		user.setnombre("Pedro");
		this.userRepository.saveAndFlush(user);
		
		
	}
	

}
