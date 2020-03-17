package com.bank.bankapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.FDAccount;

@Repository
public class TransferFundsDaoImpl implements TransferFundsDao {
	@Autowired
	private EntityManager entityManager;
	@Override
	public void createTransaction(long fromAccount, long toAccount, double ammount) {
		Session session = entityManager.unwrap(Session.class);
		Query quary=session.createQuery("from Accounts a where a.account_number=:fromAccount");
		quary.setParameter("fromAccount", fromAccount);
		List<Accounts> account1=quary.list();
		Accounts acc1=account1.get(0);
		
		Query quary1=session.createQuery("from Accounts a where a.account_number=:toAccount");
		quary1.setParameter("toAccount", toAccount);
		List<Accounts> account2=quary1.list();
		Accounts acc2=account2.get(0);
		
		long dacc1=acc1.getAccount_number();
		long dacc2=acc2.getAccount_number();
		double amount1=acc1.getBalance();
		double amount2=acc2.getBalance();
		if(dacc1==fromAccount&& dacc2==toAccount) {
			if(amount1<ammount) {
				throw new RuntimeException("Insufficient Funds");
			}
			else {
			double	newBalance =amount1-ammount;
			double	newBalance2 =amount2+ammount;
				acc1.setBalance(newBalance);
				acc2.setBalance(newBalance2);
				session.save(acc1);
				session.save(acc2);
			}
		}
	}
	@Override
	public void createTransactionFdToAccount(long fdAccount, long accountNumber, double amount) {
		Session session = entityManager.unwrap(Session.class);
		Query quary=session.createQuery("from FDAccount f where f.accountNumber=:fdAccount");
		quary.setParameter("fdAccount", fdAccount);
		System.out.println(fdAccount+""+accountNumber+""+amount);
		List<FDAccount> account1=quary.list();
		FDAccount acc1=account1.get(0);
		
		Query quary1=session.createQuery("from Accounts a where a.account_number=:accountNumber");
		quary1.setParameter("accountNumber", accountNumber);
		List<Accounts> account2=quary1.list();
		Accounts acc2=account2.get(0);
		
		long dacc1=acc1.getAccountNumber();
		long dacc2=acc2.getAccount_number();
		double amount1=acc1.getAmount();
		double amount2=acc2.getBalance();
		if(dacc1==fdAccount&& dacc2==accountNumber) {
			if(amount1<amount) {
				throw new RuntimeException("Insufficient Funds");
			}
			else {
			double	newBalance =amount1-amount;
			double	newBalance2 =amount2+amount;
				acc1.setAmount(newBalance);
				acc2.setBalance(newBalance2);
				session.save(acc1);
				session.save(acc2);
			}
		}
	}
	@Override
	public void createTransactionAccountToFd(long accountNumber, long fdAccount, double amount) {
		Session session = entityManager.unwrap(Session.class);
		Query quary=session.createQuery("from Accounts a where a.account_number=:accountNumber");
		quary.setParameter("accountNumber", accountNumber);
		List<Accounts> account1=quary.list();
		Accounts acc1=account1.get(0);
		
		Query quary1=session.createQuery("from FDAccount f where f.accountNumber=:fdAccount");
		quary1.setParameter("fdAccount", fdAccount);
		System.out.println(fdAccount+""+accountNumber+""+amount);
		List<FDAccount> account2=quary1.list();
		FDAccount acc2=account2.get(0);
		
		
		long dacc1=acc1.getAccount_number();
		long dacc2=acc2.getAccountNumber();
		double amount1=acc1.getBalance();
		double amount2=acc2.getAmount();
		
		if(dacc1==accountNumber&& dacc2==fdAccount) {
			if(amount1<amount) {
				throw new RuntimeException("Insufficient Funds");
			}
			else {
			double	newBalance =amount1-amount;
			double	newBalance2 =amount2+amount;
			
			    acc1.setBalance(newBalance);
				acc2.setAmount(newBalance2);
				session.save(acc1);
				session.save(acc2);
			}
		}
		
	}

}
