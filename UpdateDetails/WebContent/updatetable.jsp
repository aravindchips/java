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
	int id=Integer.parseInt(request.getParameter("id"));
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments","root","root");
	Statement st=con.createStatement();
	String query="select *from employee";
	ResultSet rs=st.executeQuery(query);
	int count=0;
	while(rs.next()){
		if(id==rs.getInt(1)){
			count++;
			break;
		}
		
	}
	if(count==1){%>
	<a href="update.jsp">UpdateData</a>
	 		
	<% }
	else
		out.println("No record found");

}

catch(Exception e){
	out.println(e);
}
%>
</body>
</html>