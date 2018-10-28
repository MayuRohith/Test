package com.example.Login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login.entity.Login;
import com.example.Login.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepository;

	@Override
	public List<Login> getUser() {
		return loginRepository.findAll();
	}

	@Override
	public void addUser(Login login) {
		loginRepository.save(login);
	}

	@Override
	public boolean updateUser(Login login, Integer id) {
		Login existUser = loginRepository.getOne(id);
		if (existUser.getUserId() != null) {
			login.setUserId(id);
			loginRepository.save(login);
			return true;
		} else
			return false;

	}

	@Override
	public boolean deleteUser(Integer id) {
		if (loginRepository.findById(id) != null) {
			loginRepository.deleteById(id);
			return true;
		}
		return false;
	}


}
