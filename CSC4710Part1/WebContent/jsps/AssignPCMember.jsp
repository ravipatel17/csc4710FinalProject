<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center"> Assign PC Member</h3>
	<form action="<c:url value='/AssignReview'/>" method="post">
			<input type="hidden" name="method" value="regist"/>
			PCMember1:<input type="text" name="pcmember1"/>
			<br/>
			PCMember2：<input type="text" name="pcmember2"/>
			<br/>
			PCMember3<input type="text" name="pcmember3"/>
			<br/>
			Paperid:<input type="text" name = "paperid"/>
			<br>
			<input type="submit" value="Assign"/>
	</form>
</body>
</html>