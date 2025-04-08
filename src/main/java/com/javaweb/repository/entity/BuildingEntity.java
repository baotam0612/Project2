package com.javaweb.repository.entity;

public class BuildingEntity {
	private String name;
	private Integer numberofBasement;
	private String ward;
	private String street;
	
	public String getName() {
		return name;
	}
	public Integer getNumberofBasement() {
		return numberofBasement;
	}
	public String getWard() {
		return ward;
	}
	public String getStreet() {
		return street;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberofBasement(Integer numberofBasement) {
		this.numberofBasement = numberofBasement;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}
