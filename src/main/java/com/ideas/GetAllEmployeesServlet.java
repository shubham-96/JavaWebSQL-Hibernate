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
import org.hibernate.query.Query;

public class GetAllEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetAllEmployeesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sessionFactory =  HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// employeeList = new List<>();
		List<Employe> employeeList = session.createCriteria(Employe.class).list();
		response.getWriter().println(employeeList);
		request.setAttribute("employeeList", employeeList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("showlist.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
