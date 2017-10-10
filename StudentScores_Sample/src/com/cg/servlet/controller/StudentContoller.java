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
public class StudentContoller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IStudent service=new StudentImpl();
		StudentBean bean=new StudentBean();
		String target=null;
		int res=0;
		String path=request.getServletPath();
		HttpSession session = request.getSession();
		switch(path)
		{
		case "/add.obj":
			
			target="AddStudentExam.jsp";
			ArrayList<Integer>list=new ArrayList<Integer>();
			list=service.getId();
	
			session.setAttribute("list", list);
			for(Integer o:list)
			{
				System.out.println(o);
			}
			
		break;
		
		
		case "/submit.obj":
			String id1=request.getParameter("sid");
			int id=Integer.parseInt(id1);
			String subj=request.getParameter("subj");
			String theo1=request.getParameter("Tscores");
			int theo =Integer.parseInt(theo1);
			String mcq1=request.getParameter("Mscores");
			int mcq=Integer.parseInt(mcq1);
			String lab1=request.getParameter("Lscores");
			int lab=Integer.parseInt(lab1);
			int total=service.getTotal(theo,mcq,lab);
			String grade=service.getGrade(total);
			
			bean.setId(id);
			bean.setSubject(subj);
			bean.setTheo(theo);
			bean.setMcq(mcq);
			bean.setLab(lab);
			bean.setTotal(total);
			bean.setGrade(grade);
			
			
			int result=service.addDetails(bean);
			
			if(result==1)
			{
				session.setAttribute("id", id);
				session.setAttribute("subj", subj);
				session.setAttribute("total", total);
				session.setAttribute("grade", grade);

				target="ResultScore.jsp";
			}
			else
			{
				target="Error.jsp";
			}
		break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	
	}
	
}
