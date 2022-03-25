package com.mobile.dao;

import org.springframework.data.repository.CrudRepository;

import com.mobile.entity.Mobile;

public interface MobileDao extends CrudRepository<Mobile, Integer> {

}