package in.cdac.controller;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cdac.models.UserModel;

@Validated
@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/")
	public String createUserV1(@Valid @Size(min=3, max=6) String username, @Valid @Size(min=3, max=6)  String password) {
		
		return username + " " + password;
	}
	
	
	@GetMapping("/v2")
	public UserModel createUserV2(@Valid UserModel user) {
		
		return user;
	}
	
}
