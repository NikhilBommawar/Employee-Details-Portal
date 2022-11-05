package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

														// pojo    // id data type
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
