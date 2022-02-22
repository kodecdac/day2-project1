package in.cdac.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserModel {
	
	@Size(min=3, max=6)
	private String username;
	
	@Size(min=3, max=6)
	private String password;
	
	@Email
	@Size(min=6, max=10)
	private String email;
}
