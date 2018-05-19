package com.testjpahib;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDaoImpl {
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("TestJPAHIB");
		EntityManager em = emf.createEntityManager();
		
		public Integer save(Employee employee) {
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			return employee.getId();
		}
		
		public List<Employee>getAll() {
			return em.createQuery(
					"Select e From Employee e", Employee.class).getResultList();
		}

		public void close() {
			em.close();
			emf.close();
		}

}
