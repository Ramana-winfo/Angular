package com.bank.bankapplication.dao;



import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.bankapplication.entity.Address;
import com.bank.bankapplication.entity.User;
import com.bank.bankapplication.entity.UserDetails;
@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {
	@Autowired
	private EntityManager entityManager;
	@Override
	public UserDetails registerUser(UserDetails userDetails) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		User user =new User();
		user.setId(0);
		user.setName(userDetails.getFirst_name()+" "+userDetails.getLast_name());
		user.setUserDetails(userDetails);
		//userDetails.setUser(user);
		Address address= new Address();
		
		session.save(userDetails);
		
		session.save(user);
		
		return userDetails;
		}
	@Override
	public void updateUserDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		Session session =entityManager.unwrap(Session.class);
		session.saveOrUpdate(userDetails);
	}

}
