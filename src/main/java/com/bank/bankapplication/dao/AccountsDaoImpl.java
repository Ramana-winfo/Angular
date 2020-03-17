package com.bank.bankapplication.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankapplication.entity.Accounts;
import com.bank.bankapplication.entity.User;
@Repository
public class AccountsDaoImpl implements AccountsDao {
	@Autowired
	private EntityManager entityManager;
	@Override
	public void createSingleAccount(Accounts singleAccount,int user_id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		User user=session.get(User.class, user_id);
		user.setAccount(singleAccount);
		session.save(singleAccount);
		
	}
	@Override
	public List<Accounts> getSingleAccounts() {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Accounts> cr = cb.createQuery(Accounts.class);
		Root<Accounts> root = cr.from(Accounts.class);
		cr.select(root);
		 
		Query<Accounts> query = session.createQuery(cr);
		List<Accounts> results = query.getResultList();
		return results;

	}
	@Override
	public void createJointAccount(Accounts jointAccounts, int user1, int user2) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		User primeUser=session.get(User.class, user1);
		System.out.println("user1 gets");
		User secondUser=session.get(User.class,user2);
		System.out.println("joint users"+primeUser.toString()+secondUser.toString());
		
		List<User> u=new ArrayList<User>();
		u.add(primeUser);
		u.add(secondUser);
		System.out.println("user2 gets");
		//jointAccounts.setUsers(u);
		primeUser.setJointAccount(jointAccounts);
		secondUser.setJointAccount(jointAccounts);
		session.save(jointAccounts);
	}
	@Override
	public void deleteAccount(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Accounts account = session.get(Accounts.class, id);
		session.delete(account);
	}
	
	

}
