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
	 text-align: left; 
	 }
	
	
	</style>
</head>
<body>
			<div id="shadow">
			<center>
			<form action="<c:url value='/SearchCoauthors'/>" method="post">
			1st Co-author: <input type="text" name="coauthor1"/>
			<br/>
			<br>
			2nd Co-author: <input type="text" name="coauthor2"/>
			<br/>
			<br>
			<input type="submit" value="Search"/>
			</form>
			
				<h3 align="center">Coauthors Paper Search</h3>
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
</center>
</div>

</body>
</html>