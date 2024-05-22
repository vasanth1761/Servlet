<%@page import="com.railway.model.userP"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.railways.dao.userImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> 
</head>
<style>
table{ 
border-collapse:collapse;
width:70%; 
background-color:white;
 margin-top:100px;
 margin-left:300px;
 }

td{ border:2px solid#ddd; 
padding:20px;
 margin-top:500px;
 }
 

.formm
{
  background-color:green;
  padding:500px;
}
</style>

<body>
	<center>
		<h1>
			<b>REGISTERED SUCCESSFULL</b>
		</h1>
	</center>
	<table>
		<tr class="formm">
		    <td>userid</td>
			<td >Username</td>
			<td>email</td>
			<td>phonenumber</td>
			<td>Delete</td>
			
			

		</tr>
		<%
		userImpl u=new userImpl();
		ArrayList<userP> list = u.insertTable();
		for (userP obj : list) {
		%>
		<tr>
		    <td><%=obj.getId() %></td>
			<td><%=obj.getName()%></td>
			<td><%=obj.getEmail()%></td>
			<td><%=obj.getPhonenumber()%></td>
			<form>
			<td>
			<input type="hidden" name="action" value="Delete">
			<input type="hidden" name="action" value=<%=obj.getId() %>>
			<button type="submit">Delete</button>	
			
			<%
			}
			%>
		</tr>
	</table>
	</form>
</body>
</html>
