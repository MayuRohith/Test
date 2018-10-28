package com.example.Login.service;

import java.util.List;

import com.example.Login.entity.Login;

public interface LoginService {
List<Login> getUser();
void addUser(Login login);
boolean updateUser(Login login, Integer id);
boolean deleteUser(Integer id);
}
