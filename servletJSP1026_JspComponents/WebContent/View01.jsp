<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@session="true"%>
<%! private int x=20; %>
<%! public int getValue(){
	return 10;
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		</head>
	<body>
	<%
	for(int i=0;i<5;i++){
	
	%>
	capgemini solutions.
	<%
	      }
	%>
	<%x=10 ;%>
	<%=getValue() %>
	<%
	config.getInitParameter(arg0);
	application.getInitParameter(arg0);
	request.getParameter(arg0);
	session.getId();
	System.out.println()
	%>
	</body>
</html>
<%-- 
Directives:<%@ %>
  page:session,import
  taglib
  include
   
Declarations:<%! %> They are contents of class
Instance Fields,methods.
Scriptlet:<% %> Its a java code to be added into service 
Expressions:A single value to print
Template:Its HTML part
Elements:<jsp:xxxx forward, include.
--%>
<!--
Implicit Objects 
 ServletContext:application
 ServletConfig:config
 HttpServletRequest:request
 HttpServletResponse:response
 HttpSession session
 JspWriter out:Handle to response.
 Page page:Like 'this'
 Page Context pageContext:Bundle of JSP resources
 Exception exception:refers to Exception 
 Available on only those JSP for whom
 <%--<%@page isError=true%>--%>
 

 -->