package com.example.demo.payloads;

import lombok.Data;

@Data
public class roleDto {

	private int id;
	private String name;
	public roleDto() {
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
}
