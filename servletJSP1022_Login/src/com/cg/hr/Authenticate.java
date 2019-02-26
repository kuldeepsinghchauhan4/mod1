package com.cg.hr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Pick up Query String data(Get)
		//Pick up Form data(Post)
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		//For multiple data 
		//String[]=request.getParameterValues(arg0);
		RequestDispatcher dispatch=null;
	
		if(userName.equals("aa") && (password.equals("aa"))){
			String fullName="aa aaa aaaa";
			//Request Scope
			request.setAttribute("fullName", fullName);
			dispatch=request.getRequestDispatcher("/WEB-INF/pages/MainMenu.jsp");
			
		}else {
			request.setAttribute("message", "wrong authentication plz do again");
			dispatch=request.getRequestDispatcher("/WEB-INF/pages/Login.jsp");
		}
		dispatch.forward(request, response);
		System.out.println("username:"+userName);
		System.out.println("password:"+password);
		
	}

}
