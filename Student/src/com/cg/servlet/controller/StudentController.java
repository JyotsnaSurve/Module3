package com.cg.servlet.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.student.StudentBean;
import com.cg.service.student.IStudent;
import com.cg.service.student.StudentImpl;



@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentBean bean=new StudentBean();
		IStudent service=new StudentImpl();
		String path=request.getServletPath();
		String target=null;
		switch(path)
		{
		
		case "/Submit.obj":
			String name=request.getParameter("name");
			String age1=request.getParameter("age");
			int age=Integer.parseInt(age1);
			String state=request.getParameter("state");
			String gender=request.getParameter("gender");
			String subjects1=request.getParameter("subjs");
			int subjects=Integer.parseInt(subjects1);
			String attempts1=request.getParameter("attempts");
			int attempts=Integer.parseInt(attempts1);
			String total1=request.getParameter("total");
			int total=Integer.parseInt(total1);

			bean.setName(name);
			bean.setAge(age);
			bean.setState(state);
			bean.setGender(gender);
			bean.setNoOfSubj(subjects);
			bean.setNoOfAttmpt(attempts);
			bean.setTotalScores(total);
			
			int res=service.addDetails(bean);
			if(res==1)
			{
				target="InsertSuccess.jsp";
			}
			else
			{
				target="Error.jsp";
			}
		break;
		
		case "/get.obj":
			
			ArrayList<StudentBean>list=new ArrayList<StudentBean>();
			list=service.getDetails();

			HttpSession session = request.getSession();
			session.setAttribute("arrstud", list);
			
			target="StudentScores.jsp";
		break;
		
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}
}
