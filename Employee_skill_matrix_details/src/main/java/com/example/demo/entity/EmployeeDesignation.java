package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="jeri_desi_2022")
@FieldDefaults(level=AccessLevel.PRIVATE)

@Component
public class EmployeeDesignation {

	
	@Id
	 @GeneratedValue(
		        strategy = GenerationType.SEQUENCE
		    )
	@Column(name="emp_desig")
	 int designationId;
	

	@Column(name="emp_designation")
	String designation;
	
//	@OneToMany(targetEntity=EmployeeDetails.class,fetch=FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinColumn(name="emp_ref",referencedColumnName = "emp_desig")
//	List<EmployeeDetails> List;
	
}
