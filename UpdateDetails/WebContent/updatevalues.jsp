<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="false" errorPage="errors.jsp" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{

int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String dept=request.getParameter("dept");
String desg=request.getParameter("desg");
int mobile=Integer.parseInt(request.getParameter("mobile"));
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
String sql="update employee set mobile=? where id=?";
PreparedStatement pst=con.prepareStatement(sql);

pst.setInt(1,mobile);
pst.setInt(2,id);
int count=pst.executeUpdate();
if(count==1){ %>
	<jsp:forward page="success.jsp" />
<% %>} else { %>
	<jsp:forward page="failure.jsp" />
<% }
pst.close();
con.close();

}
catch(Exception e){
	out.println(e);
}

%>

</body>
</html>