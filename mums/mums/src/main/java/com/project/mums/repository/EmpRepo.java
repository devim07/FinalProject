package com.project.mums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.mums.entities.Emp;

public interface EmpRepo extends JpaRepository<Emp, String>{
	
}
