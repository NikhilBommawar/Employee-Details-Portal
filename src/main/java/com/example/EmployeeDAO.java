package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeDAO {

	//creation of reference 
	@Autowired
	EmployeeRepository repo;
	
	
	//insertion 
	public Employee insert(Employee e) {
		return repo.save(e);
	}
	
	//retrival 
	
	public List<Employee> getall(){
		return repo.findAll();
	}
	
	
	// update
	public Employee EditUser(Employee e) {
	 Employee e2=repo.findById(e.getEmpno()).orElse(null);
	 e2.setEmpemail(e.getEmpemail());
	 e2.setEmpname(e.getEmpname());
	 e2.setAge(e.getAge());
	 return repo.save(e2);
	}
	
	// Delete
	
	public String DeletebyID(Employee e) {
		repo.deleteById(e.getEmpno());
		return "Deleted Emplyee with EmpNo "+e.getEmpno();
		
	}
}
