<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Submit.obj">
		<table border=5px align="center">
			
			<tr>
			<td>
				Name
			</td>
			<td>	
				<input type="text" name="name">
			</td>
			</tr>
			
			<tr>
			<td>
				Age
			</td>
			<td>	
				<input type="text" name="age">
			</td>
			</tr>
			
			<tr>
			<td>
				State
			</td>
			<td>
				<select id="state" name="state">
					<option value="tamilnadu">Tamilnadu</option>
					<option value="karnataka">Karnataka</option>
					<option value="pune">Pune</option>
					<option value="mumbai">Mumbai</option>
				</select>
			</td>
			</tr>
			
			<tr>
			<td>
				Gender
			</td>
			<td>
				<input type="text" name="gender">
			</td>
			</tr>
			
			<tr>
			<td>
				No of Subjects
			</td>
			<td>
				<input type="text" name="subjs">
			</td>
			</tr>
			
			<tr>
			<td>
				No Of attempts
			</td>
			<td>
				<input type="text" name="attempts">
			</td>
			</tr>
			
			<tr>
			<td>
				Total scores
			</td>
			<td>
				<input type="text" name="total">
			</td>
			</tr>
			<tr>
			<td>
				<input type="submit" value="save data">
			</td>
			</tr>
		</table>
	</form>
</body>
</html>