package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="jeri_det_22")
@FieldDefaults(level=AccessLevel.PRIVATE)


public class EmployeeDetails {
	
	@Id
	@Column(name="emp_id")
    int employeeId;
	
	@Column(name="emp_name")
    String employeeName;
	
	
	@Column(name="emp_designation")
    int designationId;
	
	@Column(name="emp_doj")
	@DateTimeFormat(iso=ISO.DATE)
    LocalDate dateOfJoin;
	
	
	
    
	
}
