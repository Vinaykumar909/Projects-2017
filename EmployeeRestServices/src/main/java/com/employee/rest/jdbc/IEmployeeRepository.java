package com.employee.rest.jdbc;

import java.sql.SQLException;
import java.util.List;

import com.employee.rest.exceptions.EmployeeCreationException;
import com.employee.rest.model.Employee;


public interface IEmployeeRepository {

	boolean updateEmployee(Employee employee) throws ClassNotFoundException, SQLException;

	boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException;

	public List<Employee> findAll() throws ClassNotFoundException, SQLException;

	Employee findEmployee(int empId) throws ClassNotFoundException, SQLException;

	void createEmployee(Employee employee) throws ClassNotFoundException, SQLException, EmployeeCreationException;

	double displayHRA(int empId);
	
	double displayGrossSal(int empId);
	
	
	
	
	
}
