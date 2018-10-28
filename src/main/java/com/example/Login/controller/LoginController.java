package com.example.Login.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Login.entity.Login;
import com.example.Login.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	
@GetMapping("/login")
public List<Login> showAllUser() {
	return loginService.getUser();
}

@PostMapping("/login")
public void addUser(@RequestBody Login login) {
	loginService.addUser(login);
}

@PutMapping("/login/{id}")
public boolean updateUser(@RequestBody Login login, @PathVariable Integer id) {
	return loginService.updateUser(login, id);
}

@DeleteMapping("/login/{id}")
public boolean deleteUser(@PathVariable Integer id) {
	return loginService.deleteUser(id);
}

}
