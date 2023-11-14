package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.BusEntityClass;

public interface busRepo extends JpaRepository<BusEntityClass, Integer>{
	
}
