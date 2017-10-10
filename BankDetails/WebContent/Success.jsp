<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" import="com.cg.account.bean.AccountBean;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet"/>
</head>
<body>
<h3>Values added successfully</h3>
details are as follows:
<table align="center">
<tr>
	<th>account no:</th>
	<td><%=session.getAttribute("accNo") %></td>
</tr>
<tr>
	<th>balance:</th>
	<td><%=session.getAttribute("bal") %></td>
</tr>
<tr>
	<th>transaction id:</th>
	<td><%=session.getAttribute("tran_id") %></td>
</tr>
</table>
</body>
</html>