package hello;

import org.springframework.web.bind.annotation.RestController;

import hello.model.User;
import hello.service.HelloService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService service;
    
    @RequestMapping("/")
    public String index() {
        return service.serviceLayer();
    }
    
    @RequestMapping("/fetchData")
    public List<User> getData(){
    	
    	return service.getDbData();
    }
    
}
