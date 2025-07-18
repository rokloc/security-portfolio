package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.FakeUserRepository;

@Service
public class HelloService {
	private final FakeUserRepository repository = new FakeUserRepository();
	
	//本来はDIコンテナからリポジトリのインスタンスを受け取るがデータベースと連携する前なので自分でnewしている
//	public HelloService(FakeUserRepository repository) {
//		this.repository = repository;
//	}
	
	public List<String> getService(){
		return Arrays.asList("こんにちは！", "Spring Bootは楽しい", "Security+も頑張ろう🔥");
	}
	
    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }

    public void registerUser(UserEntity user) {
        repository.save(user);
    }

	
}
