<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.railway.model.userP"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.railways.dao.userImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="userDetails" method="get">
<%-- <input type="hidden" name="id" value="<%= request.getParameter("id") %>"> --%>
       <input type="text"name="name"placeholder="name"><br>
        <input type="email" name="email"placeholder="email"><br>
        <input type="number"name="number"placeholder="ph"><br>
        
        <input type="hidden" name="action" value="update">
		<input type="hidden" name="updateid" value="<%=request.getParameter("updateid")%>">		
		<button type="submit">Update</button>
        </form>
       
</body>
</html>