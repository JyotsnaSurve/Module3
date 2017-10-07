<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cg.bean.student.StudentBean,java.util.ArrayList;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<StudentBean> li =(ArrayList<StudentBean>)session.getAttribute("arrstud");
	
	for(StudentBean o:li)
	{
		out.print("ID: "+o.getStudId()+"<br>");
		out.print("Name: "+o.getName()+"<br>");
		out.print("Age: "+o.getAge()+"<br>");
		out.print("State: "+o.getState()+"<br>");
		out.print("Gender: "+o.getGender()+"<br>");
		out.print("No of subjects: "+o.getNoOfSubj()+"<br>");
		out.print("No of attempts: "+o.getNoOfAttmpt()+"<br>");
		out.print("Total: "+o.getTotalScores()+"<br><br>");


	}
	
	%>
</body>
</html>