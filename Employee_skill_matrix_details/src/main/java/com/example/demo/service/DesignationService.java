package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.iface.DesignationRepository;

@Service
public class DesignationService {

	@Autowired
	private  DesignationRepository desrepo;
	
	public EmployeeDesignation save(EmployeeDesignation entity)
	{
		return this.desrepo.save(entity);
		
	}
	
    public List<EmployeeDesignation> findAlldesignation() {
		
		return this.desrepo.findAll();
	 }
    
    
   
    public EmployeeDesignation findById(int id) {
    	
    	return this.desrepo.findByDesignationId(id);
    }
}
