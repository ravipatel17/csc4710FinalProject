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
			<form action="<c:url value='/AssignReview'/>" method="post">
			<input type="hidden" name="method" value="regist"/>
			PCMember1:<input type="text" name="pcmember1"/>
			<br/>
			PCMember2：<input type="text" name="pcmember2"/>
			<br/>
			PCMember3<input type="text" name="pcmember3"/>
			<br/>
			Paperid:<input type="text" name = "paperid"/>
			<input type="submit" value="Assign"/>
			</form>
		</c:otherwise>
	</c:choose>
  </body>
</html>
