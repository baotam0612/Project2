package com.javaweb.repository.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="building")
public class BuildingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ward")
	private String ward;
	
	@Column(name="street")
	private String street;
	
	@Column(name="structure")
	private String structure;
	
	@Column(name="numberofbasement")
	private Long numberofBasement;
	
	
	@Column(name="managername")
	private String managerName;
	
	@Column(name="managerphonenumber")
	private String managerPhoneNumber;
	
	@Column(name="floorarea")
	private Long floorArea;
	
	@Column(name="rentprice")
	private Long rentPrice;
	
	@Column(name="servicefee")
	private String serviceFee;
	
	@Column(name="brokeragefee")
	private Long brokerageFee;
	
	@Column(name="direction")
	private String direction;
	
	@Column(name="level")
	private String level;
	
	@Column(name="rentpricedescription")
	private String rentPriceDescription;
	
	@Column(name="carfee")
	private String carFee;
	
	@Column(name="motorbikefee")
	private String motorbikeFee;
	
	@Column(name="overtimefee")
	private String overtimeFee;
	
	@Column(name="waterfee")
	private String waterFee;
	
	@Column(name="electricityfee")
	private String electricityFee;
	
	@Column(name="deposit")
	private String deposit;
	
	@Column(name="payment")
	private String payment;
	
	@Column(name="renttime")
	private String rentTime;
	
	@Column(name="decorationtime")
	private String decorationTime;
	
	@Column(name="note")
	private String note;
	
	@Column(name="linkofbuilding")
	private String linkofBuilding;
	
	@Column(name="map")
	private String map;
	
	@Column(name="image")
	private String image;
	
	@Column(name="createddate")
	private String createdDate;
	
	@Column(name="modifieddate")
	private String modifiedDate;
	
	@Column(name="createdby")
	private String createdBy;
	
//	
//	@Column(name="rentarea")
//	private String rentArea;
	
	@ManyToOne
	@JoinColumn(name="districtid")
	private DistrictEntity district;
	
	@OneToMany(mappedBy = "rentAreaBuilding",fetch = FetchType.LAZY)
	private List<RentAreaEntity> itemsRentArea = new ArrayList<>();
	
//	@OneToMany(mappedBy = "assigntmentBuilding", fetch = FetchType.LAZY)
//	private List<AssignmentBuildingEntity> itemsAssignment = new ArrayList<>();
//	
//	@OneToMany(mappedBy="rentTypeBuilding", fetch = FetchType.LAZY)
//	private List<BuildingRentTypeEntity> itemsRentTypeBuilding = new ArrayList<>();
	
	
	@ManyToMany(mappedBy = "buildingRentTypes", fetch = FetchType.LAZY)
	private List<RentTypeEntity> rentTypes = new ArrayList<RentTypeEntity>();
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public Long getNumberofBasement() {
		return numberofBasement;
	}

	public void setNumberofBasement(Long numberofBasement) {
		this.numberofBasement = numberofBasement;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}

	public void setManagerPhoneNumber(String managerPhoneNumber) {
		this.managerPhoneNumber = managerPhoneNumber;
	}

	public Long getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(Long floorArea) {
		this.floorArea = floorArea;
	}

	public Long getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(Long rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Long getBrokerageFee() {
		return brokerageFee;
	}

	public void setBrokerageFee(Long brokerageFee) {
		this.brokerageFee = brokerageFee;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getRentPriceDescription() {
		return rentPriceDescription;
	}

	public void setRentPriceDescription(String rentPriceDescription) {
		this.rentPriceDescription = rentPriceDescription;
	}

	public String getCarFee() {
		return carFee;
	}

	public void setCarFee(String carFee) {
		this.carFee = carFee;
	}

	public String getMotorbikeFee() {
		return motorbikeFee;
	}

	public void setMotorbikeFee(String motorbikeFee) {
		this.motorbikeFee = motorbikeFee;
	}

	public String getOvertimeFee() {
		return overtimeFee;
	}

	public void setOvertimeFee(String overtimeFee) {
		this.overtimeFee = overtimeFee;
	}

	public String getWaterFee() {
		return waterFee;
	}

	public void setWaterFee(String waterFee) {
		this.waterFee = waterFee;
	}

	public String getElectricityFee() {
		return electricityFee;
	}

	public void setElectricFee(String electricityFee) {
		this.electricityFee = electricityFee;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getRentTime() {
		return rentTime;
	}

	public void setRentTime(String rentTime) {
		this.rentTime = rentTime;
	}

	public String getDecorationTime() {
		return decorationTime;
	}

	public void setDecorationTime(String decorationTime) {
		this.decorationTime = decorationTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getLinkofBuilding() {
		return linkofBuilding;
	}

	public void setLinkofBuilding(String linkofBuilding) {
		this.linkofBuilding = linkofBuilding;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public DistrictEntity getDistrict() {
		return district;
	}

	public void setDistrict(DistrictEntity district) {
		this.district = district;
	}

//	public List<BuildingRentTypeEntity> getItemsRentTypeBuilding() {
//		return itemsRentTypeBuilding;
//	}

//	public void setItemsRentTypeBuilding(List<BuildingRentTypeEntity> itemsRentTypeBuilding) {
//		this.itemsRentTypeBuilding = itemsRentTypeBuilding;
//	}

	public void setItemsRentArea(List<RentAreaEntity> itemsRentArea) {
		this.itemsRentArea = itemsRentArea;
	}

	public List<RentTypeEntity> getRentTypes() {
		return rentTypes;
	}

	public void setRentTypes(List<RentTypeEntity> rentTypes) {
		this.rentTypes = rentTypes;
	}

	public List<RentAreaEntity> getItemsRentArea() {
		return itemsRentArea;
	}
	
	
	
	

	
}
