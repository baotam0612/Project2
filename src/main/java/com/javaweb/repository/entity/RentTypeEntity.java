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
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="renttype")
public class RentTypeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="namet")
	private String name;
	
//	@OneToMany(mappedBy = "rentTypeId", fetch = FetchType.LAZY)
//	private List<BuildingRentTypeEntity> itemsRentType;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "buildingrenttype",
	           joinColumns = @JoinColumn(name = "renttypeid", nullable = false),
	           inverseJoinColumns = @JoinColumn(name = "buildingid", nullable = false))
	private List<BuildingEntity> buildingRentTypes = new ArrayList<>();
	
}
