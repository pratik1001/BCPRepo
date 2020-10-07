package com.cg.hcs.controller;
import com.cg.hcs.service.UserServiceImpl;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			        String userName = request.getParameter("username");
			        String password = request.getParameter("password");
			        
			        UserServiceImpl service = new UserServiceImpl();
			        
			        
			        try {
			        	String userRole = service.getRoleCode(userName, password);
						if (userRole!=null) {
							
							if(userRole.equals("admin")) {
								HttpSession session =  request.getSession();
								session.setAttribute("username", userName);
								response.sendRedirect("WelcomeAdmin.jsp");
							}
							else {
								HttpSession session =  request.getSession();
								session.setAttribute("username", userName);
								response.sendRedirect("WelcomeUser.jsp");
								
							}
						  
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
			    }

}
