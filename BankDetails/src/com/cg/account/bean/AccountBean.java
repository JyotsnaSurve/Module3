package com.cg.account.bean;

public class AccountBean {

	private int acc_no;
	private String acc_T;
	private int amount;
	private int balance;
	private int tran_id;
	
	
	
	public String getAcc_T() {
		return acc_T;
	}
	public void setAcc_T(String acc_T) {
		this.acc_T = acc_T;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTran_id() {
		return tran_id;
	}
	public void setTran_id(int tran_id) {
		this.tran_id = tran_id;
	}
	
	public AccountBean(){
		
	}
	public AccountBean(int acc_no, String acc_T, int amount, int balance) {
		super();
		this.acc_no = acc_no;
		this.acc_T = acc_T;
		this.amount = amount;
		this.balance = balance;
	}
	
	
	
	
}
