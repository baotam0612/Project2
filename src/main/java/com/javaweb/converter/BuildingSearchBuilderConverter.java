package com.javaweb.converter;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.utils.MapUtil;

@Component
public class BuildingSearchBuilderConverter {
	public BuildingSearchBuilder toBuildingSearchBuilder(Map<String, Object> params, List<String> typeCode) {
		// TODO Auto-generated method stub
		BuildingSearchBuilder buildingSearchBuilder = new BuildingSearchBuilder.Builder().setName(MapUtil.getObject(params, "name", String.class))
				.setFloorArea(MapUtil.getObject(params, "floorarea", Long.class))
				.setWard(MapUtil.getObject(params, "ward", String.class))
				.build();
		return buildingSearchBuilder;
	}

}
