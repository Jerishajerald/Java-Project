package com.example.demo.iface;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.EmployeeDesignation;

public interface DesignationRepository extends JpaRepository<EmployeeDesignation, Integer> {

	
	public EmployeeDesignation findByDesignationId(int id);
}
