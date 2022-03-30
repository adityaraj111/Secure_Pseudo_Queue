package com.natwest.fakequeue.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class TransactionEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer transactionId;
	

	public TransactionEntity(Integer transactionId, String accountNumber, String type, String amount, String currency,
			String accountForm) {
		super();
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.accountForm = accountForm;
	}

	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
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

	@Column(name = "account_number")
	private String accountNumber;
	
	@Column(name = "type")
	private String type;
	@Column(name = "amount")
	private String amount;
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "account_form")
	private String accountForm;

	@Override
	public String toString() {
		return "TransactionEntity [accountNumber=" + accountNumber + ", type=" + type + ", amount=" + amount
				+ ", currency=" + currency + ", accountForm=" + accountForm + "]";
	}



	
	
}
