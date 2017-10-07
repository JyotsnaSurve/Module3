package com.cg.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.customer.CustomerBean;
import com.cg.service.customer.CustomerImpl;
import com.cg.service.customer.ICustomer;


@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerBean bean=new CustomerBean();
		ICustomer service=new CustomerImpl();
		PrintWriter out=response.getWriter();
		String path=request.getServletPath();
		String target = null;
		switch(path)
		{
		case "/add.obj":
			target="NewCustomer.html";
			
		break;
		
		case "/Customer.obj":
			
			String customerName=request.getParameter("cName");
			String phone=request.getParameter("phone");
			String password=request.getParameter("pwd");
			String repassword=request.getParameter("repwd");
			
			bean.setCustomerName(customerName);
			bean.setPhoneNo(phone);
			bean.setPhoneNo(password);
			bean.setPhoneNo(repassword);
			
			int res=service.addDetails(bean);
			HttpSession session1=request.getSession();
			session1.setAttribute("seqid", res);
			target="Success.jsp";
			
			
			/*if(res==1)
			{
				target="Success.html";
			}
			else
			{
				target="Error.html";
			}
			*/
			break;
			
		case "/payment.obj":
			target="Payment.jsp";
		break;
		
		case "/result.obj":
			String amt=request.getParameter("amt");
			int amount=Integer.parseInt(amt);
			int remain=1000-amount;
			HttpSession ses = request.getSession(false);
			ses.setAttribute("rem", remain);
			
			target="result.jsp";
		
		break;
		case "/details.obj":
			
			
			ArrayList<CustomerBean>list=new ArrayList<CustomerBean>();
			list=service.getDetails();
			target="displaydetails.html";
			for(CustomerBean o:list)
			{
				System.out.println(o);
			}

			HttpSession session = request.getSession();
			session.setAttribute("arrcust", list);
			
			target="retrieve.jsp";
			
		break;
		
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
