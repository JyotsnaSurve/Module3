<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cg.bean.student.StudentBean,java.util.ArrayList;"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>
	<th>stud id</th>
	<td><%=session.getAttribute("id") %></td>
</tr>
<tr>
	<th>subject name</th>
	<td><%=session.getAttribute("subj") %></td>
</tr>

<tr>
	<th>total</th>
	<td><%=session.getAttribute("total") %></td>
</tr>

<tr>
	<th>grade</th>
	<td><%=session.getAttribute("grade") %></td>
</tr>
</table>

</body>
</html>