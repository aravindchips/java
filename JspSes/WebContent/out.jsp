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
String name=(String)session.getAttribute("sessname");
String pswd=(String)session.getAttribute("sesspswd");
int age=(int)session.getAttribute("sessage");
out.println("hai user"+" "+name);
out.println("ur age and password are"+" " +age+" "+" "+pswd);
%>
</body>
</html>