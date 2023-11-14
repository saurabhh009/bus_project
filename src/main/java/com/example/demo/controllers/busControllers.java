package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.payloads.ApiResponse;
import com.example.demo.payloads.busDto;
import com.example.demo.service.busService;
import com.example.demo.service.impl.busServiceImpl;

@RestController
@RequestMapping("/api/v1/bus")
public class busControllers {

	@Autowired
	private busService BusSevice;
	
	@PostMapping("/")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<busDto> createBus(@RequestBody busDto busDto) {
		busDto createBusDto = this.BusService.addDetails(busDto);
		return new ResponseEntity<>(createBusDto, HttpStatus.CREATED);
	}
	
	@PutMapping("/{userId}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<busDto> updateBus(@RequestBody busDto busDto, @PathVariable("userId") Integer uid) {
		busDto updatedUser = this.BusService.updateBus(busDto, uid);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("/{userId}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> deleteBus(@PathVariable("userId") Integer uid) {
		this.BusService.deleteBus(uid);
		return new ResponseEntity<String>("User deleted Successfully", HttpStatus.OK);
	}

	public busService getBusSevice() {
		return BusSevice;
	}

	public void setBusSevice(busService busSevice) {
		BusSevice = busSevice;
	}
    }
	
	
