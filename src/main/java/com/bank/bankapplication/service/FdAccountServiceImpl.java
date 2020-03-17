package com.bank.bankapplication.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapplication.dao.FdAccountDao;
import com.bank.bankapplication.entity.FDAccount;
import com.bank.bankapplication.view.FDAccoutView;

@Service
public class FdAccountServiceImpl implements FdAccountService {

	@Autowired
	FdAccountDao dao;
	@Override
	@Transactional
	public void createFd(FDAccoutView fdv) {
		
		int userId = fdv.getUserId();
		
		FDAccount fd = new FDAccount();
		fd.setAccountNumber(fdv.getAccountNumber());
		fd.setAmount(fdv.getAmount());
		fd.setTimePeriod(fdv.getTimePeriod());
		
		dao.createFd(fd,userId);
		
		
	}
	@Override
	@Transactional
	public List<FDAccoutView> getUserFds(int id) {
		// TODO Auto-generated method stub
		List<FDAccount> fds=dao.getUserFds(id);
		List<FDAccoutView> fdViews = new ArrayList<FDAccoutView>();
		for(int i=0;i<fds.size();i++) {
			FDAccount fd= fds.get(i);
			FDAccoutView fdView = new FDAccoutView();
			fdView.setUserId(fd.getId());
			fdView.setAccountNumber(fd.getAccountNumber());
			fdView.setAmount(fd.getAmount());
			fdView.setTimePeriod(fd.getTimePeriod());
			fdViews.add(fdView);
		}
		return fdViews;
	}
	
	@Override
	@Transactional
	public void deleteFd(int id) {
		// TODO Auto-generated method stub
		
		dao.deleteFd(id);
		
	}

}
