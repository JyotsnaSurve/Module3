package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.runtime.Context;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
       
    
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String phone=request.getParameter("pnumber");
		String password=request.getParameter("pwd");
		
		ServletContext context=getServletContext();
		context.setAttribute("username",name);
		
		//RequestDispatcher rd=getServletContext().getRequestDispatcher("/SecondServlet");
		//RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
		//rd.forward(request, response);
		response.sendRedirect("SecondServlet");
		
		
		/*PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("Welcome "+name);
		out.println("your phone number is "+phone);
		out.println("your password is "+password);
		out.println("</html></body>");*/
	
		//System.out.println(name);
	}

}
