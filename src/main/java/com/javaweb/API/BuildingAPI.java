package com.javaweb.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingDTO;
import com.javaweb.service.BuildingService;

import customexception.FieldRequireException;

@RestController
public class BuildingAPI {
//	static final String DB_URL ="jdbc:mysql://localhost:3306/estatebasic";
//	static final String USER = "root";
//	static final String PASS = "Tam06122005@";
	@Autowired
	private BuildingService buildingService;
	@GetMapping(value = "/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(name="name", required = false) String name ,
			@RequestParam(name="districtid", required = false) Long districtId
			) {
//		try {
//			System.out.println(5 / 0);
//			valiDate(building);
//		} catch (FieldRequireException e) {
//			ErrorReponseDTO errorReponseDTO = new ErrorReponseDTO();
//			errorReponseDTO.setError(e.getMessage());
//			ArrayList<String> details = new ArrayList<String>();
//			details.add("Check lai name hoac numberofBasement di boi vi null");
//			errorReponseDTO.setDetail(details);
//			return errorReponseDTO;
//		}
//		BuildingDTO res = new BuildingDTO();
//	    res.setName(name);
//	    res.setNumberofBasement(numberofBasement);
//	    res.setWard(ward);
//	    res.setStreet(street);
//	    return res;
//		System.out.print(5/0);\
//		valiDate(building);
//		return null;
//		String sql = "SELECT * FROM building where name like'%"+name+"%'";
//		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
//		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(sql);){
//			while(rs.next()) {
//				BuildingDTO building = new BuildingDTO();
//				building.setName(rs.getString("name"));
//				building.setStreet(rs.getString("street"));
//				building.setWard(rs.getString("ward"));
//				building.setNumberofBasement(rs.getInt("numberofbasement"));
//				result.add(building);
//			}
//			
//		}catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Connected db failed...");
//		}
//		return result;
		List<BuildingDTO> result = buildingService.findAll(name, districtId);
		return result;
	}

	public void valiDate(BuildingDTO buildingDTO) {
		if (buildingDTO.getName() == null || buildingDTO.equals("") || buildingDTO.getNumberofBasement() == null) {
			throw new FieldRequireException("name or numberofBasement is null!");
		}
	}

//	@GetMapping(value = "/api/building/")
//	public void getBuilding2(BuildingDTO buildingDTO) {
//		System.out.println(buildingDTO.getWard());
//	} 
	@DeleteMapping(value = "/api/building/{id}/{name}")
	public void deleteBuiding(@PathVariable Integer id, @PathVariable String name) {
		System.out.println("da xoa toa nha " + id + " co ten " + name + " roi nhe!");
	}
}