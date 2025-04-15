package com.javaweb.API;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.model.BuildingDTO;
import com.javaweb.service.BuildingService;

import customexception.FieldRequireException;

@RestController
@PropertySource("classpath:application.properties")
public class BuildingAPI {

	@Autowired
	private BuildingService buildingService;
	
	@Value("${dev.nguyen}")
	private String data;
	
	@GetMapping(value="/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam Map<String, Object> params,
			@RequestParam(name="typeCode", required = false) List<String> typeCode)
			{
		List<BuildingDTO> result = buildingService.findAll(params, typeCode);
		return result;
	}

//	public void valiDate(BuildingDTO buildingDTO) {
//		if (buildingDTO.getName() == null || buildingDTO.equals("") || buildingDTO.getNumberofBasement() == null) {
//			throw new FieldRequireException("name or numberofBasement is null!");
//		}
//	}

//	@GetMapping(value = "/api/building/")
//	public void getBuilding2(BuildingDTO buildingDTO) {
//		System.out.println(buildingDTO.getWard());
//	} 
	@DeleteMapping(value = "/api/building/{id}/{name}")
	public void deleteBuiding(@PathVariable Integer id, @PathVariable String name) {
		System.out.println("da xoa toa nha " + id + " co ten " + name + " roi nhe!");
	}
}