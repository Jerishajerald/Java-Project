package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="/api/v1")
public class EmployeeController {
	
    @Autowired
	private EmployeeService service;
    
 
//@RolesAllowed(value= {"ADMIN"})
    @PostMapping(path="/add")
    public EmployeeDetails save(@RequestBody EmployeeDetails entity)
    {
		return this.service.saveOrUpdate(entity);
    	
    }
    
    @GetMapping
    public List<EmployeeDetails> findAll()
    {
    	return this.service.findAll();
    }
    
    @PutMapping(path="service/{id}/{name}")
    public ResponseEntity<Integer> updateRating(@PathVariable("id")int id,@PathVariable("name")String updated) {
    	int update=this.service.update(id, updated);
    	return ResponseEntity.ok().body(update);
    	
    }
    
    @GetMapping(path = "/name/{empname}")
    
    public EmployeeDetails findByName(@PathVariable("empname") String name) {
    	
    	return this.service.findByName(name);
    }
    
    @GetMapping(path="/findbyid/id/{id}")
    public EmployeeDetails findByDesignationId(int id)
    {
		return this.service.findById(id);
    	
    }
}
