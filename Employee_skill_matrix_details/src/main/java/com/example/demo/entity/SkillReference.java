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
@Table(name="jeri_skill_refe_22")
@FieldDefaults(level=AccessLevel.PRIVATE)
public class SkillReference {
@Id
@Column(name="skill_id")
	int skillId;

@Column(name="skill_type")
	String skillType;

@Column(name="skill_name")
	String skillName;

@Column(name="created_date")
@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdDate;

@Column(name="created_by")
@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdBy;

@Column(name="created_time")
@DateTimeFormat(iso=ISO.DATE)
	LocalDate createdTime;
	
}
