package com.bank.bankapplication.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankapplication.entity.FDAccount;
import com.bank.bankapplication.entity.User;

@Repository
public class FdAccountDaoImpl implements FdAccountDao {

	@Autowired
	EntityManager em;
	
	@Override
	public void createFd(FDAccount fd, int userId) {
		Session session = em.unwrap(Session.class);
		User user =  session.get(User.class, userId);
		System.out.println("this is user Object"+user);
		List<FDAccount> list = user.getFdaccount();
		System.out.println("this is list "+list);
		list.add(fd);
		user.setFdaccount(list);
		System.out.println("this is list from user"+user.getFdaccount());
	//	fd.setUser(user);
		session.saveOrUpdate(user);
	}
	
	@Override
	public List<FDAccount> getUserFds(int id) {
		// TODO Auto-generated method stub
		Session session = em.unwrap(Session.class);
		User user = session.get(User.class, id);
		return user.getFdaccount();
	}

	@Override
	public void deleteFd(int id) {
		// TODO Auto-generated method stub
		Session session = em.unwrap(Session.class);
		FDAccount fdaccount = session.get(FDAccount.class, id);
		session.delete(fdaccount);	
	}

}
