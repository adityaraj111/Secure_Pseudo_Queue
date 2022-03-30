package com.natwest.fakequeue.bean;

import java.io.Serializable;

public class Transaction implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", type=" + type + ", amount=" + amount + ", currency="
				+ currency + ", accountForm=" + accountForm + "]";
	}
	private String accountNumber;
	private String type;
	private String amount;
	private String currency;
	private String accountForm;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAccountForm() {
		return accountForm;
	}
	public void setAccountForm(String accountForm) {
		this.accountForm = accountForm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
