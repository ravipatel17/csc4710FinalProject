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
		 p{
	 font-weight:bold;
	 }
	
	</style>
</head>
<body>
<div id="shadow">
<center>
<h1> 
Edit Review
</h1>
<p> To insert a review, give the papername, review, reviewer name, date of the review and the recommendation</p>
<form action="<c:url value='/InsertReview'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br> <br>
Review: <input type="text" name="review" /> 
<br> <br>
Reviewer Name: <input type="text" name="reviewerName"/> 
<br> <br>
Date: <input type="date" name="date"/> 
<br>  <br>
Recommendation (Accept/Reject): <input type="checkbox" value='y' name="rec"/> yes 
<input type="checkbox" value='n' name="rec"/> no
<br> <br>
<input type="submit" value="Insert"/> 
</form>

<br> 

<p>To delete a review, enter a papername</p>
<form action="<c:url value='/DeleteReview'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br> <br>
<input type="submit" value="Delete"/> 
<br>
</form>

<br> 
</center>
</div>
</body>
</html>