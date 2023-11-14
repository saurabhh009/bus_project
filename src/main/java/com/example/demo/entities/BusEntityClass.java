package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BusEntityClass {
	
	/*Design a Bus Booking System 

	In this system, users have two roles:- 
	ADMIN:- He should be able to
	Add, update, and delete Bus Details.
	Bus Details:- 
	-> Name of the bus 
	-> Number of seats 
	-> Occupancy
	-> Available days of operation for each bus
	B)  USER:-  He should be able to
	1.  See the number of buses available between the source and destination with distance and 
	ETA for each bus
	See the number of seats available on the bus
	Book a seat on the Bus.
	Cancel a seat on the bus (if booked already).
	Users see the buses first which are near them first.       

	Constraints :

	-> Block booking of seats on a bus if the Occupancy of that bus is more than  80% and show the same message to the user and tell him to book a seat on another bus.
	-> After booking each user has a unique seat number.
	-> Two users can't book the same seat.
	Premkumar S Harti2:02 PM
	Note:-
	-> Use the database of your choice 
	-> You can design the UI of your choice*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String busName;
	private int noSeats;
	private boolean available_days[]=new boolean [7];
	private boolean occupancy[]=new boolean [this.noSeats];
	
	public BusEntityClass() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getNoSeats() {
		return noSeats;
	}

	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats;
	}

	public boolean[] getAvailable_days() {
		return available_days;
	}

	public void setAvailable_days(boolean[] available_days) {
		this.available_days = available_days;
	}

	public boolean[] getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(boolean[] occupancy) {
		this.occupancy = occupancy;
	}

	public BusEntityClass(Integer id, String busName, int noSeats, boolean[] available_days, boolean[] occupancy) {
		super();
		this.id = id;
		this.busName = busName;
		this.noSeats = noSeats;
		this.available_days = available_days;
		this.occupancy = occupancy;
	}
	
	
}
