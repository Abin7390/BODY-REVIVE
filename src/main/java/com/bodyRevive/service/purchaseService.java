package com.bodyRevive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodyRevive.entity.purchase;
import com.bodyRevive.repository.purchaseRepository;

@Service
public class purchaseService {

	
	@Autowired
	public purchaseRepository purch;
	
	
	public void purchass(purchase p) {
		purch.save(p);
	}
	public List<purchase> getallbooking()
	{
		return purch.findAll();
	}
}
