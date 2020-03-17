package com.bank.bankapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankapplication.entity.User;
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

}
