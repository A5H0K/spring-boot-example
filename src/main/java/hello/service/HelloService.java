package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hello.dao.UserRepository;
import hello.model.User;

@Service("service")
public class HelloService {
	
	@Autowired
	UserRepository userRepository;
	
	public String serviceLayer(){
		
		return "Greetings from Service Layer";
	}
	
	
	public List<User> getDbData(){
		
		return userRepository.findAll();
	}

}
