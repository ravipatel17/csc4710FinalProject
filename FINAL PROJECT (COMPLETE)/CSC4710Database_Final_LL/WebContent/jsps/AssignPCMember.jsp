<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	
	body{
		background-color : #A9A9A9; 
		border: solid; 
	 }
	 
	 a {
		text-transform:none;
		text-decoration:none;
	}
	a:hover {
		text-decoration:underline;
	}
	 
	 #shadow { 
	 border : 1px solid; 
	 padding: 10px; 
	 background-color: #4682B4;
	 }
	
	
	</style>
</head>
<body>
	<div id="shadow">
	<center>
	<h3 align="center"> Assign PC Member</h3>
	<p>Please Enter using email of PC Member</p>
	<form action="<c:url value='/AssignReview'/>" method="post">
			<input type="hidden" name="method" value="regist"/>
			PCMember1: <input type="text" name="pcmember1"/>
			<br>
			<br>
			PCMember2：<input type="text" name="pcmember2"/>
			<br>
			<br>
			PCMember3: <input type="text" name="pcmember3"/>
			<br><br>
			Title: <input type="text" name = "title"/>
			<br>
			<br>
			<input type="submit" value="Assign"/>
	</form>
	</center>
	</div>
</body>
</html>