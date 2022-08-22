package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.dto.Employee;
import com.example.exception.RecordNotFoundException;



@Service
public class EmployeeServiceImpl  {
	
	@Autowired
	EmployeeDao repository;
	
	public Employee createOrUpdateEmployee(Employee entity){
		
		Optional<Employee> employee = repository.findById(entity.getEmpId());

		if(employee.isPresent()) 
		{
			Employee newEntity = employee.get();
			
			newEntity.setEmpId(entity.getEmpId());
			newEntity.setEmpEmail(entity.getEmpEmail());
            newEntity.setEmpName(entity.getEmpName());
            newEntity.setEmpEmail(entity.getEmpEmail());
            newEntity.setEmpContactDetails(entity.getEmpContactDetails());
            newEntity.setEmpDesignation(entity.getEmpDesignation());
 
            newEntity = repository.save(newEntity);
            
            return newEntity;
		} else {
			entity = repository.save(entity);
			return entity;
		}
	}
	
	
	public Employee getEmployeeById(Long id)  throws RecordNotFoundException {

		Optional<Employee> employee = repository.findById(id);

		if(employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
		
	}
	
	public List<Employee> listOfEmp() {

		List<Employee> emp = new ArrayList<Employee>();
		repository.findAll().forEach(emp1->emp.add(emp1));

		return emp;
	}
	
	public void deleteStudent(Long id) throws IllegalArgumentException {
		repository.deleteById(id);

	}
	
	public void updateEmployee(Employee emp){
		repository.save(emp);
	}
	
}
 
 
