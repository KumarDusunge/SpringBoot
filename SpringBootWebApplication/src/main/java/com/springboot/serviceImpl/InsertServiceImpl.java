package com.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.InsertDao;
import com.springboot.service.InsertService;

@Service("insertService")
public class InsertServiceImpl implements InsertService {

	@Autowired
	InsertDao insertDao;
	
	public Boolean inserDocument(String document) {
		return insertDao.insertDocument(document);
	}

}
