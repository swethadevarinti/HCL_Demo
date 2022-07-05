package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.Employee;
import com.example.exception.RecordNotFoundException;
import com.example.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeService;

	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}

	@RequestMapping("/addform")
	public String showAddPage() {
		return "Addform";
	}

	@RequestMapping("/searchform")
	public String showSearchPage() {
		return "searchform";
	}

	@RequestMapping("/updateform") 
	public String showUpdatePage() {
		return "updateform";
	}

	@RequestMapping("/editform") 
	public String showEditPage() { 
		return "editform";
	}

	@RequestMapping("/deleteform")
	public String showDeletePage() {
		return  "delete"; 
	}


	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(ModelMap map, @RequestParam Long eId, @RequestParam String eName, @RequestParam String eEmail,
			@RequestParam String eCell, @RequestParam String eDes) {
		System.out.println("::::::::::::::::::::::::add::::::::::::::::::::::::::::::::::::");

		map.addAttribute("operation", "Employee Insertion");

		Employee emp = new Employee();
		emp.setEmpId(eId);
		emp.setEmpName(eName);
		emp.setEmpEmail(eEmail);
		emp.setEmpContactDetails(eCell);
		emp.setEmpDesignation(eDes);
		
		Employee employee = employeeService.createOrUpdateEmployee(emp);

		if(employee == null) {
			return "failure";
		}
		return "success";
	}
	
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String  search(ModelMap map, @RequestParam Long eid) {
		System.out.println("::::::::::::::::::::::::search:::::::::::::::::::::::::");
		String status = ""; 
		Employee emp = null;

		try {
			emp = employeeService.getEmployeeById(eid);
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(emp == null) {
			status = "notexisted";
		}else {
			map.addAttribute("emp", emp);
			status = "studentdetails";
		}
		return status; 
	}
	
	 @RequestMapping(value="editform", method = RequestMethod.POST) 
	 public String getEditForm(ModelMap map, @RequestParam Long eId) {
		 
		 String status = "";
		 Employee emp = null;
		 
		try {
			emp = employeeService.getEmployeeById(eId);
			
		} catch (RecordNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 if(emp == null) {
			 status =  "notexisted";
		 }else {
			 map.addAttribute("std", emp); 
			 status="editform";
		 }
		 return status; 
	 }
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	  public String update(ModelMap map,@RequestParam Long eId, @RequestParam String eName, @RequestParam String eEmail,
			  @RequestParam String eCell, @RequestParam String eDes) {

		String status = "success";
		map.addAttribute("operation", "Employee Updation"); 
		Employee emp = new Employee();
		emp.setEmpId(eId);
		emp.setEmpName(eName); 
		emp.setEmpEmail(eEmail);
		emp.setEmpContactDetails(eCell);
		emp.setEmpDesignation(eDes);
		employeeService.updateEmployee(emp);
		return status;
	}
	
	
	 @RequestMapping(value = "delete", method = RequestMethod.POST)
	 public String delete(ModelMap map, @RequestParam Long eId) {
		 
		 map.addAttribute("operation", "Employee Deletion"); 
		 try {
		 employeeService.deleteStudent(eId);
		 }catch(Exception e) {
			 e.printStackTrace();
			 return "failure";
		 }
		 return "success";
	 }
	
	 @RequestMapping(value = "list", method = RequestMethod.GET) 
	  public ModelAndView listOfStu(ModelMap map) {
		  ModelAndView mv = new ModelAndView();
		  
		  List<Employee> list = employeeService.listOfEmp();
		  
		  mv.setViewName("studentInfo");
		  mv.addObject("list",list);
		  return mv;
	  }
	
	
	

}
