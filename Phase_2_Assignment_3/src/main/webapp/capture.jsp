<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<jsp:useBean id="capturebean" class="com.siddesh.capturebean" scope="session"></jsp:useBean>
     <jsp:setProperty property="*" name="capturebean"/>
     <a href="fetch.jsp">click to get the data</a><br><br>
     <a href="fetch1.jsp">logout</a>
     <%@include file="footer.jsp" %>
   </body>
</html>