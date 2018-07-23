<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center"> Top Reviewer(s) Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>name</th>
		<th>email</th>
	</tr>

<c:forEach items="${PCMemberList}" var="pcmember">
	<tr>
		<td>${pcmember.name }</td>
		<td>${pcmember.email }</td>
	</tr>
</c:forEach>
</table>

</body>
</html>