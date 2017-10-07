package com.cg.service.customer;

import java.util.ArrayList;

import com.cg.bean.customer.CustomerBean;
import com.cg.dao.customer.CustomerDaoImpl;
import com.cg.dao.customer.ICustomerDao;

public class CustomerImpl implements ICustomer{

	ICustomerDao dao=new CustomerDaoImpl();
	
	public int addDetails(CustomerBean bean) {
		
		return dao.addDetails(bean);
	}


	public ArrayList<CustomerBean> getDetails() {
		
		return dao.getDetails();
	}

}
