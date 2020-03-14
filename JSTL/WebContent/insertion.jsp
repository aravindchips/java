<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.sql.*,javax.servlet.http.HttpServlet"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db"driver="com.mysql.jdbc.Driver"url="jdbc:mysql://localhost/3306/aravind"user="root"password="root"/>
<%
String name=request.getParameter("name");
String id=request.getParameter("id");
String clg=request.getParameter("clg");
%>
<c:out value="${name}"/>
<c:out value="${id}"/>
<c:out value="${clg}"/>
<sql:update dataSource="${db}" var="count">
Insert into students value(?,?,?);
<sql:param value="${name}"/>
<sql:param value="${id}"/>
<sql:param value="${clg}"/>
</sql:update>
<sql:query dataSource="${db}" var="rs">
select *from students;
</sql:query>
<table border="2" width="100%">
<tr>
<th>name</th>
<th>id</th>
<th>clg</th>
</tr>
<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.name}"/></td>
<td><c:out value="${table.id}"/></td>
<td><c:out value="${table.clg}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>