package com.javaweb.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="buildingrenttype")
public class BuildingRentTypeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	
	@ManyToOne
	@JoinColumn(name="buildingid")
	private BuildingEntity rentTypeBuilding;
	
	@ManyToOne
	@JoinColumn(name="renttypeid")
	private RentTypeEntity rentTypeId;

}
