package com.cg.account.service;

import java.util.ArrayList;

import com.cg.account.bean.AccountBean;

public interface IAccountService {

	ArrayList<Integer> getId();

	int addDetails(AccountBean bean);

	int getBalance(int amount);

	int getTranId();

	//boolean validateAmount(int amount);

}
