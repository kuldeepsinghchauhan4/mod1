package com.cg.hr;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*The context parameters are accessible to all web components in an application
Get them from ServletContext(One object per Application)
Servlets, JSP, Filters, listeners.
The config parameters
Declare common values like company Name,URLS of other applications.
The Config parameters:
Get them from SrevletConfig(One object per Servlet/JSP)
Accessible to only a parent web component
Not accessible to any other web component
*/
//@WebServlet("/MyServlet01")
public class MyServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx=getServletContext();//genericServlet
		String companyName=ctx.getInitParameter("companyName");
        System.out.println(companyName);
        
        ServletConfig config=super.getServletConfig();//GenericServlet
        String pageTitle=config.getInitParameter("pageTitle");
        System.out.println("Page Title:"+pageTitle);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
