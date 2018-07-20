<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
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

  </head>
  
  <body>
    <c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<h1>Welcome to the demo</h1>	
		</c:when>
		<c:otherwise>
			<form action="<c:url value='/initialize'/>" method="post">
			<input type="submit" name="initialize" value="initialize"/>
			</form> 
			
			<br>

			<a href="<c:url value='/jsps/coauthors.jsp'/>" target="body">Search Co-authors</a>&nbsp;
			<br>
			<a href="<c:url value='/jsps/AssignPCMember.jsp'/>" target="body">Assign PC Member</a>&nbsp;
			<br>
			<a href="<c:url value='/MostReviews'/>" target="body">List the PC Member who reviewed the most papers</a>
			<br>
		
			<a href="<c:url value='/NoReview'/>" target="body">List the PC Member are not assigned to a review</a>			
			<br>
			<a href="<c:url value='/RejectedMattJohn'/>" target="body">List the papers rejected by Matt and John</a>
			<br>
			<a href="<c:url value='/AcceptedPapers'/>" target="body">List the accepted papers</a>
			<br>
			
		<form action="edit.jsp"> 
		<input type ="submit" name="Edit Pc Members" value="Edit Pc Members" /> 
		</form>
		
		<br>
		
		<form action="editPaper.jsp"> 
		<input type ="submit" name="Edit Paper" value="Edit Paper" /> 
		</form>
		
		
		<br> 
		
		<form action="editReview.jsp"> 
		<input type ="submit" name="Edit Review" value="Edit Review" /> 
		</form>
		
		<br> 
		
		<form action="searchSingle.jsp"> 
		<input type ="submit" name="Search Single" value="Search Single" /> 
		</form>
		
		<br> 
		
		<form action="searchFirstAuthor.jsp"> 
		<input type ="submit" name="First Author" value="Search First Author" /> 
		</form>
		</c:otherwise>
		
		
	</c:choose>
  </body>
</html>
