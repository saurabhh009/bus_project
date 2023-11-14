package com.example.demo.payloads;

public class busDto {

	private Integer id;
	private String busName;
	private int noSeats;
	private boolean available_days[]=new boolean [7];
	private boolean occupancy[]=new boolean [this.noSeats];
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
	public busDto(Integer id, String busName, int noSeats, boolean[] available_days, boolean[] occupancy) {
		super();
		this.id = id;
		this.busName = busName;
		this.noSeats = noSeats;
		this.available_days = available_days;
		this.occupancy = occupancy;
	}
	
	public busDto() {
		// TODO Auto-generated constructor stub
	}
}
