<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">Accepted Papers</h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>PaperID</th>
		<th>Title</th>
	</tr>
    

	<tr>
		<td>${Paper.paperid }</td>
		<td>${Paper.title}</td>
	</tr>
</c:forEach>

</body>
</html>