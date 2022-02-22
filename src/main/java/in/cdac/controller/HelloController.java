package in.cdac.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// localhost:8080/
@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi";
	}
	
	
	@GetMapping("/m1")
	public String method1(String message) {
		return "Hi Method " + message;
	}
	
	
	@GetMapping("/m2")
	public String method1(String message, String subject) {
		return "Hi Method " + message + " " + subject;
	}
	
	
	@GetMapping("/m3")
	public int matchScore() {
		return 10;
	}
	
	
	@GetMapping("/city-list")
	public List<String> cityList() {
		
		/*List<String> list = new ArrayList<>();
		list.add("delhi");
		list.add("chennai");
		list.add("muambi");*/
		
		List<String> list = Arrays.asList("delhi", "calcutta");
		return list;
	}
	
	
	@GetMapping("/city-map")
	public Map<String, Object> cityMap() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", 1);
		map.put("username", "cdac");
		map.put("email", "cdac@cdac.in");
		
		return map;
	}
	
	
	
}

















