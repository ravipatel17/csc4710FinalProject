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
	
	table{
		border-collapse: collapse; 
	}
	
	table, th, td{
		border: 2px solid #000000;
		background-color: #A9A9A9;
	}
	
	
	</style>
</head>
<body>
<div id="shadow">
	<h3 align="center">Papers Rejected by John and Matt</h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>PaperID</th>
		<th>Title</th>
	</tr>
<c:forEach items="${PaperList}" var="paper">
	<tr>
		<td>${paper.paperid }</td>
		<td>${paper.title }</td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>