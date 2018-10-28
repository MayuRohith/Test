package com.example.Login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Login.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
