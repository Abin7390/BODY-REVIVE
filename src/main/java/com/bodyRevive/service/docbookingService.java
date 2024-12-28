package com.bodyRevive.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodyRevive.entity.docbooking;

import com.bodyRevive.repository.docbookingRepository;

@Service
public class docbookingService {
	

	@Autowired
	public docbookingRepository doc;
	
	
	public void doccy(docbooking d) {
		doc.save(d);
	}
	public List <docbooking> getalldocbooking()
	{
		return doc.findAll();
	}
	
}

