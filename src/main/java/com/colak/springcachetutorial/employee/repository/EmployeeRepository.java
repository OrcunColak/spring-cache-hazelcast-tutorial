package com.colak.springcachetutorial.employee.repository;

import com.colak.springcachetutorial.employee.jpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
