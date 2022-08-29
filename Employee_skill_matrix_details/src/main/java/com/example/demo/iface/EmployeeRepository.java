package com.example.demo.iface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.EmployeeDesignation;
import com.example.demo.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer>{
	@Modifying
	@Transactional
	 @Query(value = "update EmployeeDetails set employeeName =:name where employeeId=:srchId")

		public int modifyname(@Param("srchId")int Id,@Param("name") String updatedname);

	
	public EmployeeDetails findByEmployeeName(String name);
	
	public EmployeeDetails findByDesignationId(int id);
	
	}
	

