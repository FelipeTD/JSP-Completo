package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private LoginService userValidationService = new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {		
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isValid = userValidationService.isUserValid(name, password);
		
		if(isValid) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todos.do");
		} else {
			request.setAttribute("errorMessage", "Invalid Credential");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}