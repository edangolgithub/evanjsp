<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="b" class="evan.beans.Mrbean"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<jsp:getProperty property="id" name="b"/>
<jsp:getProperty property="name" name="b"/>
<jsp:getProperty property="add" name="b"/>

<%
out.print(b.getName());
%>
</body>
</html>