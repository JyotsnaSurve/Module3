<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Student Details</h3>
<form action="submit.obj">
		<table border=5px align="center">
			
			<tr>
			<td>
				Student id
			</td>
			<td>	
				<select id="sid" name="sid">
					<c:forEach items="${sessionScope.list}" var="studid">
						<option value="${studid}">${studid}</option>
					</c:forEach>
				</select>
			</td>
			</tr>
			
			<tr>
			<td>
				Subject name
			</td>
			<td>	
				<select id="subj" name="subj">
					<option value="subject 1">subject 1</option>
					<option value="subject 2">subject 2</option>
					<option value="subject 3">subject 3</option>
					<option value="subject 4">subject 4</option>
				</select>
			</td>
			</tr>
			
			<tr>
			<td>
				Theory scores
			</td>
			<td>
				<input type="text" name="Tscores">
			</td>
			</tr>
			
			<tr>
			<td>
				MCQ scores
			</td>
			<td>
				<input type="text" name="Mscores">
			</td>
			</tr>
			
			<tr>
			<td>
				Lab scores
			</td>
			<td>
				<input type="text" name="Lscores">
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