package com.cg.hr;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* Life cycle methods 
 * init(ServletConfig)- It's for initialization.
 * Initialization,Resources Allocation and overriding. 
 * init()-It is for intialization and overriding.
service()-this method is called on every request
destroy()-this method is called while un-deploying the servlet 
resource deallocation.
eager: Createrd at the time of starting the server.Consumes memory resources right from begining.
NOrmally used for the servlets which are always used by all users.
load on startup is +ve.
Lazy:created only when first request comes in.
Normally used for servlets which may be instantiated optionally.
ListALlEmps, AddNewEmps
*/

@WebServlet(urlPatterns="/Myservlet",loadOnStartup=2)
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		System.out.println("In init(srevletConfig)");
	}

	public void destroy() {
		System.out.println("In destroy()");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet()");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
