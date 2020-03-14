<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
String pswd=request.getParameter("pswd");
int age=Integer.parseInt(request.getParameter("age"));
session.setAttribute("sessname",name);
session.setAttribute("sesspswd",pswd);
session.setAttribute("sessage",age);
out.println("welcome"+name);
%>
<a href="out.jsp">Check Here for Details</a>
</body>
</html>