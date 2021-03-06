package com.ideas;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.google.gson.Gson;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void destroy() {
		super.destroy();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Integer s = Integer.parseInt(request.getParameter("empID"));
		Employe employe = session.find(Employe.class, s);
		session.getTransaction().commit();
		
		Gson gson = new Gson();
		String employeeJson = gson.toJson(employe);
		//response.setContentType("application/json");
		response.getWriter().append(employeeJson);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Employe employe = new Employe();
		employe.setName(request.getParameter("username"));
		
		employe.setCompanyEmployeeID(Integer.parseInt(request.getParameter("comEmpID")));
		
		employe.setDepartment(request.getParameter("department"));
		System.out.println(request.getParameter("self"));
		if(request.getParameter("self") != null)
			employe.setSelf(true);
		else
			employe.setSelf(false);
		employe.setGender(request.getParameter("gender"));
		employe.setContactNumber(Long.parseLong(request.getParameter("contact")));
		session.save(employe);
		session.getTransaction().commit();
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.include(request, response);
	}
}
