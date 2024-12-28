package com.bodyRevive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodyRevive.entity.products;

@Repository
public interface productsRepository extends JpaRepository<products, Long>{

	products findByProductid(Long productid);

}
