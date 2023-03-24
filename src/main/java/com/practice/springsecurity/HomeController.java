package com.practice.springsecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	AuthenticationService authenticationService;
	
	@GetMapping
	public Authentication allMethod() {
		 
		return authenticationService.getAuthentication();
	}
	
	@GetMapping("/user")
	public Authentication userMethod() {
		return authenticationService.getAuthentication();
	}
	
	@GetMapping("/admin")
	public Authentication adminMethod() {
		return authenticationService.getAuthentication();
	}
	
	

}
