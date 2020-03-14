<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="userinfo" class="testbean.Details" />
<jsp:setProperty property="name" name="userinfo"/>
<jsp:setProperty property="pswd" name="userinfo"/>
<jsp:setProperty property="age" name="userinfo"/>

<jsp:getProperty property="name" name="userinfo"/>
<jsp:getProperty property="pswd" name="userinfo"/>
<jsp:getProperty property="age" name="userinfo"/>

