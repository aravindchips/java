<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" import="java.sql.* ,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>I am from deposit page</h1>
<%
String id=(String)session.getAttribute("id");
String pswd=(String)session.getAttribute("pswd");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
String query="update banking set balance=? where id=?";
PreparedStatement pst=con.prepareStatement(query);
//pst.setFloat(1, balance);
pst.setString(2, id);
int count=pst.executeUpdate();
if(count==1){
	out.println("Amount deposited successfully");
}
%>
</body>
</html>