<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
			<form action="<c:url value='/SearchCoauthors'/>" method="post">
			<input type="hidden" name="method" value="regist"/>
			1st Co-author:<input type="text" name="coauthor1"/>
			<br/>
			2nd Co-author:<input type="text" name="coauthor2"/>
			<br/>
			<input type="submit" value="Search"/>
			</form>
</body>
</html>