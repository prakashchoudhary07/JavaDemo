<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List, model.User"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB ACCESS PAGE</title>
</head>
<body>
	<table>
		<%
			Object message = request.getAttribute("message");
			if(message != null){
				out.println(message);
			}
			
			@SuppressWarnings("unchecked")
			List<User> user = (List<User>) request.getAttribute("user");
			for (User userData : user) {
		%>
		<tr>
			<td>
				<%
					out.println(userData.getUsn());
				%>
			</td>
			
			<td>
				<%
					out.println(userData.getName());
				%>
			</td>
			
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>