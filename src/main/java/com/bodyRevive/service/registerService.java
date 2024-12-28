package com.bodyRevive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodyRevive.entity.register;
import com.bodyRevive.repository.RegisterRepository;

@Service
public class registerService {
	
	@Autowired
	public RegisterRepository bRepo;
	public void save(register r) {
	bRepo.save(r);
	}
	public List <register> getAllregister()
	{
		return bRepo.findAll();
	}
	
	

}
