package com.cg.dao.customer;

import java.util.ArrayList;

import com.cg.bean.customer.CustomerBean;

public interface ICustomerDao {

	int addDetails(CustomerBean bean);

	ArrayList<CustomerBean> getDetails();

}
