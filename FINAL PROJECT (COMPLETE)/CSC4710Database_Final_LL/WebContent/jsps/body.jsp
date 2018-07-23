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
	
	
	
	</style>
  </head>
  
  <body>
    <c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<center><h1>Welcome to the Conference</h1>
			Please Register to get started, or log in if you are already an existing user. 
			</center>	
		</c:when>
		<c:otherwise>
			<center><b>Initialize our Database first before proceeding! </b><form action="<c:url value='/initialize'/>" method="post">
			<input type="submit" name="initialize" value="initialize"/>
			</form> </center>
			<div class="a">
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
			<a href="<c:url value='/jsps/edit.jsp'/>" target="body">Edit PcMembers</a>&nbsp;
			<br>
			<a href="<c:url value='/jsps/editPaper.jsp'/>" target="body">Edit Papers</a>&nbsp;
			<br>
			<a href="<c:url value='/jsps/editReview.jsp'/>" target="body">Edit Reviews</a>
			<br>
			<a href="<c:url value='/jsps/searchSingle.jsp'/>" target="body">Search Single Author</a>
			<br>
			<a href="<c:url value='/jsps/searchFirstAuthor.jsp'/>" target="body">Search First Author</a>
			<br>
			</div>
		</c:otherwise>
		
		
	</c:choose>
  </body>
</html>
