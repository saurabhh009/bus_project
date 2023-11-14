package com.example.demo.service;

import com.example.demo.payloads.busDto;

public interface busService {

	busDto addDetails(busDto BusDto);
	
	busDto updatebus(busDto BusDto, int id);
	
	void deleteBus(int id);
}
