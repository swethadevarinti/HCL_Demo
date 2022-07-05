package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {
	
	 
}
