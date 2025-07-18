package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.UserEntity;

//@Ripository
public class FakeUserRepository {
	private final List<UserEntity> users = new ArrayList<>();
	
	public List<UserEntity> findAll(){
		return users;
	}
	
	public void save(UserEntity user) {
		users.add(user);
	}
	
	
}
