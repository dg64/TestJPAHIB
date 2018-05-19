package com.testjpahib;

import java.util.List;

import com.testjpahib.Employee;
import com.testjpahib.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDaoImpl daoEmployee = new EmployeeDaoImpl();
		
		Employee newEmp = new Employee("Paolo", "Bianchi", 1000);
		daoEmployee.save(newEmp);
		
		List<Employee> employes = daoEmployee.getAll();
		
		for(Employee employee: employes) {
			System.out.println(
					employee.getFirstName() + ' ' +
					employee.getLastName() + ' ' +
					employee.getSalary());
		}

		daoEmployee.close();

	}

}
