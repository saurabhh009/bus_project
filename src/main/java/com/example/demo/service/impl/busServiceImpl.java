package com.example.demo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.BusEntityClass;
import com.example.demo.exceptions.ResourceNotFound;
import com.example.demo.payloads.busDto;
import com.example.demo.repositories.busRepo;
import com.example.demo.service.busService;

public class busServiceImpl implements busService{

	
	@Autowired
	private busRepo BusRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public busDto addDetails(busDto BusDto) {
		// TODO Auto-generated method stub
		BusEntityClass bus = this.modelMapper.map(BusDto, BusEntityClass.class);
		BusEntityClass busAdded= this.BusRepo.save(bus);
		return this.modelMapper.map(busAdded, busDto.class);
	}

	@Override
	public busDto updatebus(busDto BusDto, int id) {
		// TODO Auto-generated method stub
		BusEntityClass bus = this.BusRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFound("User", " Id ", id));
		BusEntityClass updatedBus = this.BusRepo.save(bus);
		busDto busDto1 = this.modelMapper.map(updatedBus, busDto.class);
		return busDto1;
		
	}

	@Override
	public void deleteBus(int id) {
		// TODO Auto-generated method stub
		BusEntityClass bus = this.BusRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFound("User", " Id ", id));
		this.BusRepo.delete(bus);
	}

}
