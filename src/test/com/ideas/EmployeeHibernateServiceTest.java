package com.ideas;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EmployeeHibernateServiceTest {

	Session session = null;
	
	@Before
	public void setUp() {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Assert.assertNotNull(sessionFactory);	
		session = sessionFactory.openSession();
		session.beginTransaction();
	}
	
	@After
	public void after() {
		session.getTransaction().commit();		
	}
	
	@Test
	public void shouldCreateSessionFactory() {
		Employe employe = createEmploye("Shubham");
		session.save(employe);
	}
	
	@Test
	public void updateEmployee() {
		Employe employe = session.find(Employe.class, 1);
		assertEquals("Shubham", employe.getName());
		employe.setName(employe.getName() + " Burewar");
		session.save(employe);
		employe = session.find(Employe.class, 1);
		assertEquals("Shubham Burewar", employe.getName());
	}
	
	@Test
	public void findByNameQuery() {
		Query findEmployeeQuery =  session.createNamedQuery("FIND_BY_NAME");
		findEmployeeQuery.setParameter("empName", "Shubham");
		List resultList = findEmployeeQuery.getResultList();
		Employe emp = (Employe)resultList.get(0);
		assertEquals("Shubham", emp.getName());
	}
	
	@Test
	public void deleteEmployee() {
		Employe employe = session.find(Employe.class, 1);
		session.delete(employe);
		employe = session.find(Employe.class, 1);
		assertNull(employe);
	}
	
	@Test
	public void shouldSaveEmployeeList() {
		Employe employe1 = createEmploye("Shubham");
		Employe employe2 = createEmploye("Surendra");
		
		List<Employe> empList = Arrays.asList(employe1, employe2);
		for (Employe em : empList) {
			session.save(em);
			session.flush();
		}
	}

	private Employe createEmploye(String empName) {
		Employe employe = new Employe();
		employe.setName(empName);
		employe.setCompanyEmployeeID(101);
		employe.setDepartment("SD");
		employe.setContactNumber(100);
		employe.setGender("MALE");
		employe.setSelf(true);
		return employe;
	}
}
