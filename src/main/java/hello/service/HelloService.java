package hello.service;

import org.springframework.stereotype.Service;

@Service("service")
public class HelloService {
	
	public String serviceLayer(){
		
		return "Love You Baby";
	}

}
