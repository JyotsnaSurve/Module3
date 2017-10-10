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

import com.cg.account.bean.AccountBean;
import com.cg.account.service.AccountServiceImpl;
import com.cg.account.service.IAccountService;


@WebServlet("*.obj")
public class AccountController extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IAccountService service=new AccountServiceImpl();
		AccountBean bean=new AccountBean();
		HttpSession session = request.getSession();
		String target=null;
		String path=request.getServletPath();
		switch(path)
		{
		case "/withdraw.obj":
			ArrayList<Integer>list=new ArrayList<Integer>();
			list=service.getId();
			session.setAttribute("list", list);
			target="Withdraw.jsp";
		break;	
		
		case "/submit.obj":
			
			String accNo1=request.getParameter("accNo");
			int accNo=Integer.parseInt(accNo1);
			String accT=request.getParameter("accT");
			String amount1=request.getParameter("amount");
			int amount=Integer.parseInt(amount1);
			//if(service.validateAmount(amount))
			
			int balance=service.getBalance(amount);
			int tran_id=service.getTranId();
			
			bean.setAcc_no(accNo);
			bean.setAcc_T(accT);
			bean.setAmount(amount);
			bean.setBalance(balance);
			bean.setTran_id(tran_id);
			
			int result=service.addDetails(bean);

			if(result==1)
			{
				session.setAttribute("accNo", accNo);
				session.setAttribute("bal", balance);
				session.setAttribute("tran_id", tran_id);
				target="Success.jsp";
			}
			
		break;
		
	
		}
	RequestDispatcher rd=request.getRequestDispatcher(target);
	rd.forward(request, response);
	}

}
