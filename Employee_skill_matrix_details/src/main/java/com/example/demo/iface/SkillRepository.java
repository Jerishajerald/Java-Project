package com.example.demo.iface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entity.EmployeeSkills;

public interface SkillRepository extends JpaRepository<EmployeeSkills, Integer> {
	
    public List<EmployeeSkills> findByExperience(int experience);

    
	@Query(nativeQuery = true,value = "select * from jeri_skill_22 where skill_name=:skillName and skill_experience=:years")
	public List<EmployeeSkills> getBySkillNameAndExperience(@Param("skillName") String skillName,@Param("years") int years);
	public List<EmployeeSkills> findByApprovedBy(String approvedBy);
	public List<EmployeeSkills> findByStatus(String status);
	public List<EmployeeSkills>findBySkillName(String skillName);


	
	

}
