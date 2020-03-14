<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
int count=0;
String name=request.getParameter("name");
String pswd=request.getParameter("pswd");
Class.forName("com.mysql.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
Statement st=connection.createStatement();
ResultSet rs=st.executeQuery("select *from users");
response.getWriter();
while(rs.next()){
	String t1=rs.getString(1);
	String t2=rs.getString(2);
if(name.equals(t1)&& pswd.equals(t2))
{
	count=1;
}
}
if(count==1){%>
<p style="color:green">Authorized user</p>
<%}
else{%>
<p style="color:red">Not an authorized user</p>
<% }


}catch(Exception e){
	out.println(e);
}
%>
</body>
</html>