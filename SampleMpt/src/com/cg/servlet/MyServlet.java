package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.obj")
public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String path=request.getServletPath();
		System.out.println(path);
		String target=null;
		
		switch(path)
		{
		case "/add.obj":
			target="empform.html";
		break;
		
		case "/details.obj":
			String name=request.getParameter("ename");
			String phone=request.getParameter("emob");
			String email=request.getParameter("email");
			out.print(name);
			out.print(phone);
			target="success.html";
		break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		
		
		
	}

	

}
