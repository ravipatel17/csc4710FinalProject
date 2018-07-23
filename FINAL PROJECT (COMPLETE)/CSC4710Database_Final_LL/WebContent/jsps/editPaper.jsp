<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<title>Insert title here</title>
</head>
<body>
<div id="shadow">
<h1>
Edit Paper 
</h1>
<p> Insert Paper</p>
<form action="<c:url value='/InsertPaper'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br>
Abstract: <input type="text" name="abstract"/>
<br>
PDF: <input type="text" name="pdf"/>
<br>
<input type="submit" value="Insert"/> 
</form>

<br> 
<p>Delete Paper</p>
<form action="<c:url value='/DeletePaper'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br>
<input type="submit" value="Delete"/> 
</form>

<br> 

<p>Update the Paper Title</p>
<form action="<c:url value='/UpdatePaperTitle'/>" method="post"> 
Paper Name: <input type="text" name="paperName" /> 
<br> 
Updated Name: <input type="text" name="paperUpdate"/>
<br>
<input type="submit" value="Update"/> 
</form>
<br> 

<p>Update the Abstract</p> 
<form action="<c:url value='/UpdatePaperAbstract'/>" method="post"> 
Paper Name: <input type="text" name="paperName"/> 
<br>
New Abstract: <input type="text" name="abstract"/>
<br>
<input type="submit" value="Update"/> 
</form>

<p>Update the PDF</p> 
<form action="<c:url value='/UpdatePaperPDF'/>" method="post"> 
Paper Name: <input type="text" name="paperName"/> 
<br>
New PDF: <input type="text" name="pdf"/>
<br>
<input type="submit" value="Update"/> 
</form>

<p>Insert Author Information</p> 
<form action="<c:url value='/InsertAuthor'/>" method="post"> 
 Name: <input type="text" name="AuthorName"/> 
<br>
 Email: <input type="text" name="AuthorEmail"/>
<br>
Affiliation: <input type="text" name="AuthorAffiliation"/>
<br>
<input type="submit" value="Insert"/> 
</form>

<p>Delete Author Information</p> 
<form action="<c:url value='/DeleteAuthor'/>" method="post"> 
 Name: <input type="text" name="AuthorName"/> 
 <br>
<input type="submit" value="Delete"/> 
</form>

<p>Update Author Name</p> 
<form action="<c:url value='/UpdateAuthorName'/>" method="post"> 
 Updated Name: <input type="text" name="AuthorName"/> 
<br>
 Email: <input type="text" name="AuthorEmail"/>
<br>
<input type="submit" value="update"/> 
</form>

<p>Update Author Email</p> 
<form action="<c:url value='/UpdateAuthorEmail'/>" method="post"> 
 Name: <input type="text" name="AuthorName"/> 
<br>
 Updated Email: <input type="text" name="AuthorEmail"/>
<br>
<input type="submit" value="update"/> 
</form>

<p>Update Author Affiliation</p> 
<form action="<c:url value='/UpdateAuthorAffiliation'/>" method="post"> 
 Name: <input type="text" name="AuthorName"/> 
<br>
 Updated Affiliation: <input type="text" name="AuthorAffiliation"/>
<br>
<input type="submit" value="update"/> 
</form>

<p>Add Author to Paper</p> 
<form action="<c:url value='/InsertAuthorToPaper'/>" method="post"> 
Author Name: <input type="text" name="AuthorName"/> 
<br>
Paper Title: <input type="text" name="title"/>
<br>
Contribution Significance (1 is highest): <input type = "text" name = "contNum"/>
<br>
<input type="submit" value="Add"/> 
</form>

<p>Update Author Contribution</p> 
<form action="<c:url value='/UpdateAuthorContNum'/>" method="post"> 
Author Name: <input type="text" name="AuthorName"/> 
<br>
Paper Title: <input type="text" name="title"/>
<br>
Contribution Significance (1 is highest): <input type = "text" name = "contNum"/>
<br>
<input type="submit" value="Assign"/> 
</form>

<p>Delete Author from Paper</p>
<form action="<c:url value='/DeleteAuthorFromPaper'/>" method="post"> 
Author Name: <input type="text" name="AuthorName"/> 
<br>
Paper Title: <input type="text" name="title"/>
<br>
<input type="submit" value="Delete"/> 
</form>


</div>
</body>
</html>