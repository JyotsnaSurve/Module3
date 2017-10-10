package com.cg.account.dao;

import java.util.ArrayList;

import com.cg.account.bean.AccountBean;

public interface IAccountDao {

	ArrayList<Integer> getId();

	int addDetails(AccountBean bean);

	int getTranId();

}
