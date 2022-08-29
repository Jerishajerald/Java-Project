package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.entity.TransactionLog;
import com.example.demo.iface.DesignationRepository;
import com.example.demo.iface.EmployeeRepository;
//import com.example.demo.iface.TransactionRepository;
//import com.example.demo.entity.TransactionLog;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	
	
//	@Autowired
//	private TransactionRepository transaction;
	
//	@Autowired
//	private TransactionLog log;
	
//	public void transactiondetail(Object obj,Object obj2)
//	{
//		log.setApiOperationName("Employee_details");
//		log.setRequest(obj.toString());
//		log.setResponse(obj2.toString());
//		log.setTransactionId(101);
//		log.setLoginId(101);
//		this.transaction.save(log);
//		
//		
//	}
	public EmployeeDetails saveOrUpdate( EmployeeDetails entity)
	{
	   
		return this.repo.save(entity);
		
	}
	public List<EmployeeDetails> findAll() {
		
		return this.repo.findAll();
	}
	

    public EmployeeDetails findByName(String name) {
    	
    	return this.repo.findByEmployeeName(name);
    } 
    public int update(int id, String name)
 {
		return this.repo.modifyname(id, name);
 	
 }  
    
  
    public EmployeeDetails findById( int id) {
		
    	return this.repo.findByDesignationId(id);
    	
    }
	
}
