package com.cg.service.customer;

import java.util.ArrayList;

import com.cg.bean.customer.CustomerBean;

public interface ICustomer {

	int addDetails(CustomerBean bean);
	ArrayList<CustomerBean> getDetails();
}
