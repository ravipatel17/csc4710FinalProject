<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <head>
    <base href="">
    
    <title>body</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	
	body{
		background-color : #A9A9A9; 

	 }
	 
	 a {
		text-transform:none;
		text-decoration:none;
	}
	a:hover {
		text-decoration:underline;
	}
	 
	div.a{
	text-align: center; 
	background-color: #4682B4; 
	border: 2px solid #000000;
	}
	
			 #shadow { 
	 border : 1px solid; 
	 padding: 10px; 
	 background-color: #4682B4;
	 text-align: left; 
	 }
	 
	 p{
	 font-weight:bold;
	 }
	
	</style>

  </head>
  <div id="shadow">
	<h1> Edit Pc Members</h1>
<p>To insert a new member, fill the below out</p>
<form action="<c:url value='/InsertPC'/>" method="post"> 
Name: <input type="text" name="pcName" /> 
<br>
Email: <input type="text" name="paper" /> 
<br>
<input type="submit" value="Insert"/> 
</form>

<br> 
<p>To delete a member, enter their name.</p>
<form action="<c:url value='/DeletePC'/>" method="post"> 
Name: <input type="text" name="pcName" /> 
<br>
<input type="submit" value="Delete"/> 
</form>

<br> 
<p>To update a PC member Email, enter their name first.</p>
<form action="<c:url value='/UpdatePC'/>" method="post"> 
Name: <input type="text" name="pcNameUpdate" /> 
<br>
Email: <input type="text" name="paperUpdate" /> 
<br>
<input type="submit" value="Update"/> 
</form>

<br> 
<p>To update a PC member name, enter their email first.</p>
<form action="<c:url value='/UpdatePCName'/>" method="post"> 
Email: <input type="text" name="emailUpdate" /> 
<br>
Name: <input type="text" name="pcNameUpdate" /> 
<br>
<input type="submit" value="Update"/> 
</form>
</div>
</body>
</html>