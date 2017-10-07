<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.cg.bean.customer.CustomerBean,java.util.ArrayList;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<CustomerBean> li = (ArrayList<CustomerBean>)session.getAttribute("arrcust");
	
	for(CustomerBean o:li)
	{
		out.print("ID: "+o.getCustomerId()+"<br>");
		out.print("Name: "+o.getCustomerName()+"<br>");
		out.print("Mobile "+o.getPhoneNo()+"<br><br>");
	}
	
	%>
	
</body>
</html>