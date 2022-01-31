<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Record:<br>
	<jsp:useBean id="capturebean" class="com.siddesh.capturebean" scope="session"></jsp:useBean>
	ID:<jsp:getProperty property="ID" name="capturebean"/><br>
	NAME:<jsp:getProperty property="name" name="capturebean"/><br>
	AGE:<jsp:getProperty property="age" name="capturebean"/><br>
	DEPT:<jsp:getProperty property="dept" name="capturebean"/><br>
	
</body>
</html>