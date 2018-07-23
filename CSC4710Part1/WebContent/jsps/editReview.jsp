<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 
Edit Review
</h1>

<form action="<c:url value='/insertReview'/>" method="post"> 
<input type="submit" value="Insert"/> 
</form>

<br> 

<form action="<c:url value='/deleteReview'/>" method="post"> 
<input type="submit" value="Delete"/> 
</form>

<br> 

<form action="<c:url value='/updateReview'/>" method="post"> 
<input type="submit" value="Update"/> 
</form>

</body>
</html>