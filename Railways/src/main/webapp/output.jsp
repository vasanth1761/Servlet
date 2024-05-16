<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.railway.model.*" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{
border-collapse:collapse;
width:50%;
background-color:grey;
margin-top:100px;
margin-left:300px;
}
td{
border:2px solid#ddd;
padding:8px;
margin-top:500px;
}
for
{
text-align:center;

}
</style>
</head>
<body>
<center>
<h1 ><b>REGISTERED SUCCESSFULL</b></h1>
</center>
<table>
<tr>
 <td style=background>Username</td>
 <td>email</td>
 <td>phonenumber</td>
 <td>date</td>
 <td>password</td>
 <td>location</td>
 
</tr>
<% ArrayList<railwayPojo> list =( ArrayList<railwayPojo>) request.getAttribute("list");
	for(railwayPojo obj:list){
%>
<tr>
<td><%= obj.getUsername()%></td>
<td><%= obj.getemail()%></td>
<td><%= obj.getPhonenumber()%></td>
<td><%= obj.getDate()%></td>
<td><%= obj.getPassword()%></td>
<td><%=obj.getLocation() %></td>
<%
}
	%>
</table>
</form>
</body>
</html>