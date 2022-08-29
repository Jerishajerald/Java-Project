package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.iface.DesignationRepository;
import com.example.demo.iface.SkillRepository;



@Service
public class EmployeeSkillService {
	
	
	@Autowired
	private SkillRepository skillrepo;
	
	@Autowired 
	private DesignationRepository repo;
	
	@Autowired
	private EmployeeService ser;
	
	@Autowired
	private DesignationService service;
	
//	@Autowired
//	private EmployeeSkills skill;
////	
//	if(entity!=null)
//	{
//		skill.setStatus("DRAFT");
//	}
   public EmployeeSkills add(EmployeeSkills entity) {
	   
		return this.skillrepo.save(entity);
	}
	
	public List<EmployeeSkills> findAll(){
		
		return this.skillrepo.findAll();
	}
	
	public List<EmployeeSkills> findBySkillName(String skillName){
			
		return this.skillrepo.findBySkillName(skillName);
	}
	
	public List<EmployeeSkills> findByExperience(int years){
		
		return this.skillrepo.findByExperience(years);
	}
	
	public List<EmployeeSkills> getBySkillNameAndExperience(String skillName,int experience){
		
		return this.skillrepo.getBySkillNameAndExperience(skillName, experience);
	}
	
	public List<EmployeeSkills> findByApprovedBy(String approved_by){
		
		return this.skillrepo.findByApprovedBy(approved_by);
	}

	public List<EmployeeSkills> findByStatus(String status){
		
		return this.skillrepo.findByStatus(status);
	}

	public List<EmployeeSkills> managerWork(int id,String status){
		
		
		EmployeeDetails det = ser.findById(id);
		EmployeeDesignation desig = service.findById(id);
		List<EmployeeSkills> skill = null;
		
		if(det.getDesignationId()==desig.getDesignationId()) {
			
			if(desig.getDesignation().equalsIgnoreCase("Project Lead")) {
				
			skill =	this.skillrepo.findByStatus(status);
			
			
			
			}
		}
		
		return skill;
	}
	
	
	
	
	
	
	
	
	
	
	
}
