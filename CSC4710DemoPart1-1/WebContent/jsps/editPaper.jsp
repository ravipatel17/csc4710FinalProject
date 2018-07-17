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
Edit Paper 
</h1>

<form action="<c:url value='/insertPaper'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br>
Author: <input type="text" name="author" /> 
<br>
<input type="submit" value="Insert"/> 
</form>

<br> 

<form action="<c:url value='/deletePaper'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br>
<input type="submit" value="Delete"/> 
</form>

<br> 

<form action="<c:url value='/updatePaper'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br>
Author: <input type="text" name="author" /> 
<br>
<input type="submit" value="Update"/> 
</form>


</body>
</html>