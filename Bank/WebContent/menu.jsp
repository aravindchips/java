<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
String id=(String)session.getAttribute("id");
String pswd=(String)session.getAttribute("pswd");
int choice=0;
while(true){
System.out.println("1.Deposit");
System.out.println("2.Withdraw");
System.out.println("3.Balance");
System.out.println("4.Exit");
Scanner sc=new Scanner(System.in);
System.out.println("select your required option");
choice=sc.nextInt();
switch(choice){
case 1:%>
       <jsp:forward page="deposit.jsp"/>
       <%break;
case 2:%>
       <jsp:forward page="withdraw.jsp"/>
       <%break; 
case 3:%>
       <jsp:forward page="balance.jsp"/>
       <%break;
case 4:%>
       <jsp:forward page="exit.jsp"/>
       <%break;
default:out.println("Select from the options only");
}
}
}
catch(Exception e){
out.println(e);
}


%>
</body>
</html>