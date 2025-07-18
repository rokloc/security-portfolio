package com.example.demo.model;

//import jakarta.persistence.Entity;


//@Entity
public class UserEntity {
	private Long id;
	private String name;
	private String email;
	
	// コンストラクタ（任意）
    public UserEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // getter・setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
