<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search First Author</title>
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
	 
	 #shadow { 
	 border : 1px solid; 
	 padding: 10px; 
	 background-color: #4682B4;
	 }
		 p{
	 font-weight:bold;
	 }
	
	</style>
</head>

<body>
<div id="shadow">
<center>
<h1>
Searching for First Author
</h1>

<form action="<c:url value='/SearchFirst'/>" method="post">
Enter a Author to search for: <input type="text" name="author"/>
<input type="submit" value="Search"/>
<br> 
</form> 
	<h3 align="center">First Author</h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>PaperID</th>
		<th>Title</th>
	</tr>
<c:forEach items="${SingleList}" var="SingleAuthor" >
	<tr>
		<td>${SingleAuthor.paperid}</td>
		<td>${SingleAuthor.title}</td>
	</tr>
</c:forEach>
</table>
<br>
<br>
<br>



 </center>
</div>

</body>
</html>