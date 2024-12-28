package com.bodyRevive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodyRevive.entity.products;
import com.bodyRevive.repository.productsRepository;

@Service
public class productsService {

	@Autowired 
	private productsRepository productRepository;
	
	public void Products(products pro) {
		productRepository.save(pro);
    }

    public List<products> getAllProducts() {
        return productRepository.findAll();
    }

   

}
