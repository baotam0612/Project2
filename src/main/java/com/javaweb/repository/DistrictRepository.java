package com.javaweb.repository;

import java.util.List;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.DistrictEntity;

public interface DistrictRepository {
	DistrictEntity findNameById(Long id);
}
