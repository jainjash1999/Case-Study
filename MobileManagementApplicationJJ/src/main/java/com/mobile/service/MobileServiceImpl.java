package com.mobile.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
@Transactional
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	MobileDao dao;

	@Override
	public Mobile addMobile(Mobile mobile) {
		
		return dao.save(mobile);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		
		return dao.save(mobile);
	}

	@Override
	public void deleteMobile(int mobileId) {
		dao.deleteById(mobileId);
	}

	@Override
	public Optional<Mobile> getMobile(int mobileId) {
		return dao.findById(mobileId);
	}

	@Override
	public Iterable<Mobile> getAllMobile() {
		return dao.findAll();
		
	}

}