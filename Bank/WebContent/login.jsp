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
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aravind","root","root");
String id=request.getParameter("id");
String pswd=request.getParameter("pswd");
session.setAttribute("sesid", id);
session.setAttribute("sespswd", pswd);
Statement st=con.createStatement();
String query="select *from users";
ResultSet rs=st.executeQuery(query);
int count=0;
while(rs.next()){
	if(rs.getString(1).equals(id)&&rs.getString(2).equals(pswd)){
	       count++;
	}
	if(count==1){
	%>
	
		<p style="color:green">Valid user</p>
		<jsp:forward page="menu.jsp"/>
	<%}
else{%>
<p style="color:red">Invalid user</p>
<jsp:include page="login.html"/>
<%}
}
}
catch(Exception e){
	out.println(e);
}

%>

</body>
</html>