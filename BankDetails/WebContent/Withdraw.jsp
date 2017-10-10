<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet"/>
</head>
<body>
<form action="submit.obj">
		<table border=5px align="center">
			
			<tr>
			<td>
				Account No
			</td>
			<td>	
				<select id="accNo" name="accNo">
					<c:forEach items="${sessionScope.list}" var="accountNo">
						<option value="${accountNo}">${accountNo}</option>
					</c:forEach>
				</select>
			</td>
			</tr>
			
			<tr>
			<td>
				Account type
			</td>
			<td>	
				<select id="accT" name="accT">
					<option value="saving">saving</option>
					<option value="current">current</option>
				</select>
			</td>
			</tr>
			
			<tr>
			<td>
				Amount to be withdrawn
			</td>
			<td>
				<input type="text" name="amount">
			</td>
			</tr>

			<tr>
			<td  colspan=2 align=center>
				<input type="submit" value="submit">
			</td>
			</tr>
		</table>
	</form>
</body>
</html>