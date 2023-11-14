package com.example.demo.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

public class users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "user_name", nullable = false, length = 100)
	private String name;

	@Column(unique = true)
	private String email;

	private String password;
	
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BusEntityClass> posts = new ArrayList<>();
	
	//1 person can have more than 1 role
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	private Set<role> roles = new HashSet<>();
	public users() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public users(int id, String name, String email, String password, List<BusEntityClass> posts, Set<role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.posts = posts;
		this.roles = roles;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<BusEntityClass> getPosts() {
		return posts;
	}
	public void setPosts(List<BusEntityClass> posts) {
		this.posts = posts;
	}
	public Set<role> getRoles() {
		return roles;
	}
	public void setRoles(Set<role> roles) {
		this.roles = roles;
	}
}
