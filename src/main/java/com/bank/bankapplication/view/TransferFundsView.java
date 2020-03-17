package com.bank.bankapplication.view;

public class TransferFundsView {
private long toAccount;
private long fromAccount;
private long fdAccount;
private long accountNumber;
private double Ammount;


public long getFdAccount() {
	return fdAccount;
}
public void setFdAccount(long fdAccount) {
	this.fdAccount = fdAccount;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAmmount() {
	return Ammount;
}
public void setAmmount(double ammount) {
	Ammount = ammount;
}


public long getToAccount() {
	return toAccount;
}
public void setToAccount(long toAccount) {
	this.toAccount = toAccount;
}
public long getFromAccount() {
	return fromAccount;
}
public void setFromAccount(long fromAccount) {
	this.fromAccount = fromAccount;
}
public double gettAmmount() {
	return Ammount;
}
public void settAmmount(double Ammount) {
	this.Ammount = Ammount;
}



}
