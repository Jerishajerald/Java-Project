package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.service.DesignationService;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="api/v1")
public class DesignationController {
	
	@Autowired
	private DesignationService service;
	
	
	
	@PostMapping(path="/add/designation")
    public EmployeeDesignation save(@RequestBody EmployeeDesignation entity)
    {
		return this.service.save(entity);
    	
    }
    
    
    @GetMapping(path="/designation")
    public List<EmployeeDesignation> findAllDesignation()
    {
    	return this.service.findAlldesignation();
    }
    
    @GetMapping(path="/findbyid/{id}")
    public EmployeeDesignation findById(@PathVariable("id") int id) {
		return this.service.findById(id);
    	
    }
}
