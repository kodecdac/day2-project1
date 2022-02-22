package in.cdac.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cdac.models.CityModel;

// http://localhost:8080/practice/
@RestController
@RequestMapping("/practice")
public class PracticeController {
	
	@GetMapping("/")
	public String method1() {
		return "Method 1 from Pratice Controller";
	}
	
	
	@GetMapping("/m2")
	public String method2() {
		return "Method 2 from Pratice Controller";
	}
	
	
	@GetMapping("/m3")
	public CityModel method3() {
		CityModel cityMumbai = new CityModel("mumbai", "400001");
		return cityMumbai;
	}
	
	
	
	@GetMapping("/m4")
	public List<CityModel> method4() {
		List<CityModel> list = new ArrayList<>();
		
		CityModel cityMumbai = new CityModel("mumbai", "400001");
		list.add(cityMumbai);
		list.add(cityMumbai);
		list.add(cityMumbai);
		list.add(cityMumbai);
		list.add(cityMumbai);
		list.add(cityMumbai);
		
		return list;
	}
	
	
	
	
	
	

}
