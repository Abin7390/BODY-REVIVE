package com.bodyRevive.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodyRevive.entity.checkup;
import com.bodyRevive.repository.*;






@Service
public class checkupService {
	
	@Autowired
	public CheckupRepository cRepo;
	public void check(checkup c) {
		cRepo.save(c);
	}
	public List <checkup> getallcheckup()
	{
		return cRepo.findAll();
	}
	
	}

