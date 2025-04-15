package com.javaweb.repository;

import java.util.List;

public interface RentAreaRepository {
	List<String> getValueByBuildingId(Long id);
}
