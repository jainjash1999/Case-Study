package com.mobile.service;

import java.util.List;
import java.util.Optional;

import com.mobile.entity.Mobile;

public interface MobileService {
	Mobile addMobile(Mobile mobile);
	Mobile updateMobile(Mobile mobile);
	void deleteMobile(int mobileId);
	Optional<Mobile> getMobile(int mobileId);
	Iterable<Mobile> getAllMobile();

}