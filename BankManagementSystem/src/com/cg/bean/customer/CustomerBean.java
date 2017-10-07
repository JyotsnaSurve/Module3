package com.cg.bean.customer;

public class CustomerBean {

	private int customerId;
	private String customerName;
	private String phoneNo;
	private String password;
	private String repassword;
	
	
	
	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerName="
				+ customerName + ", phoneNo=" + phoneNo + ", password="
				+ password + ", repassword=" + repassword + "]";
	}

	public CustomerBean(int customerId, String customerName, String phoneNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
	}
	
	public CustomerBean() {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.password = password;
		this.repassword = repassword;
	}

	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	

}
