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
@Table(name="jeri_skill_22")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class EmployeeSkills {

	@Id
	@Column(name="emp_skills_id")
	int skillsId;
	
	@Column(name="emp_id")
	int employeeId;
	
	@Column(name="skill_id")
	int skillId;
	
	@Column(name="skill_name")
	String skillName;
	
	@Column(name="skill_experience")
	int experience;
	
	@Column(name="status")
	String status = "DRAFT";
	
	@Column(name="approveed_by")
	@DateTimeFormat(iso=ISO.DATE)
	String approvedBy;
	
	@Column(name="approved_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate approvedDate;
	
	@Column(name="created_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdDate;
	
	@Column(name="modified_date")
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate modifiedDate;
	
}
