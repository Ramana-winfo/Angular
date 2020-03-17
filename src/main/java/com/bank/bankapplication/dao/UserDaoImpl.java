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
import com.bank.bankapplication.entity.UserDetails;
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private EntityManager entityManager;
	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.save(user);
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<User> cr = cb.createQuery(User.class);
		Root<User> root = cr.from(User.class);
		cr.select(root);
		 
		Query<User> query = session.createQuery(cr);
		List<User> results = query.getResultList();
		return results;
		
	}
	@Override
	public void deleteUser(int id) {
		
		Session session=entityManager.unwrap(Session.class);
		User user = session.get(User.class, id);
		session.delete(user);	
		
	}
	@Override
	public List<Accounts> getAccounts(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		User user = session.get(User.class, id);
		System.out.println("this is user in dao: "+user);
		Accounts account1= user.getAccount();
		Accounts account2 = user.getJointAccount();
		System.out.println("this is single account : "+account1);
		System.out.println("this is joint account : "+account2);
		List<Accounts> list =new ArrayList();
		list.add(account1);
		list.add(account2);
		return list;
	}
	@Override
	public UserDetails getUser(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);

		UserDetails usr= session.get(UserDetails.class, id);
		return usr;
	}
	
	@Override
	public User getUserById(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		User user = session.get(User.class, id);
		return user;
	}

}
