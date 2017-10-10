package com.cg.account.service;

import java.util.ArrayList;

import com.cg.account.bean.AccountBean;
import com.cg.account.dao.AccountDaoImpl;
import com.cg.account.dao.IAccountDao;

public class AccountServiceImpl implements IAccountService {

	IAccountDao dao=new AccountDaoImpl();
	@Override
	public ArrayList<Integer> getId() {
		return dao.getId();
	}
	
	@Override
	public int addDetails(AccountBean bean) {
		return dao.addDetails(bean);
	}

	@Override
	public int getBalance(int amount) {

		int balance=100000-amount;
		
		return balance;
	}

	/*public boolean validateAmount(int amount) {
		if(amount>0)
			return true;
		else
		{
			System.out.println("please enter valid amount");
			return false;
		}
	}*/
	@Override
	public int getTranId() {
		return dao.getTranId();
	}

}
