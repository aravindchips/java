<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,data.Employee"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This will display the employee present in the employee table</h1>

<table border="1" width="100%">
<tr>
<th>EmpId</th>
<th>EmpName</th>
<th>Department</th>
<th>Designation</th>
<th>Email</th>
</tr>
<%
List<Employee> list=(List<Employee>) request.getAttribute("data");
out.println(list);
%>
<c:set var="list1" value="${list}"/>
<c:forEach items="${list}" var="u">
<tr>
<td>${u.getEmpid()}</td>
<td>${u.getEmpname()}</td>
<td>${u.getDept()}</td>
<td>${u.getDesg()}</td>
<td>${u.getEmail()}</td>
</tr>
</c:forEach>
</table>
</body>
</html>