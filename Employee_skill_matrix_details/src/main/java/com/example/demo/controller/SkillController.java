package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.service.EmployeeSkillService;

@RestController
@RequestMapping(path="/api/v1/")
public class SkillController {
	
	@Autowired
	private EmployeeSkillService service;
	
	
	@PostMapping(path = "/add/detail")
	public EmployeeSkills add(@RequestBody EmployeeSkills entity) {
		
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/skills")
	public List<EmployeeSkills> findAllEmpSkills(){
		
		return this.service.findAll();
	}
	
	@GetMapping(path = "/srch/skillname/{skillName}")
	public List<EmployeeSkills> findBySkillName(@PathVariable("skillName") String skillName){
		
		return this.service.findBySkillName(skillName);
	}
	
	@GetMapping(path = "/srch/experience/{experience}")
	public List<EmployeeSkills> findByExperience(@PathVariable("experience") int years){
		
		return this.service.findByExperience(years);
	}
	
	@GetMapping(path = "/srch/{skillName}/{experience}")
	public List<EmployeeSkills> getBySkillNameAndExperience(@PathVariable("skillName") String skillName,@PathVariable("experience") int experience){
		
		return this.service.getBySkillNameAndExperience(skillName, experience);
	}
	
	@GetMapping(path = "/srch/approvedby/{approver}")
	public List<EmployeeSkills> findByApprovedBy(@PathVariable("approver") String approver){
		
		return this.service.findByApprovedBy(approver);
	}
	
	@GetMapping(path = "/srch/status/{status}")
	public List<EmployeeSkills> findByStatus(@PathVariable("status") String status){
		
		return this.service.findByStatus(status);
	}
	
	@GetMapping(path = "/managerwork/{id}/{status}")
	public List<EmployeeSkills> managerWork(@PathVariable("id") int id,@PathVariable("status") String status){
		
		return this.service.managerWork(id, status);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
