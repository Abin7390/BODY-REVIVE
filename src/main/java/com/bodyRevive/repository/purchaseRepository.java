package com.bodyRevive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodyRevive.entity.purchase;

import jakarta.persistence.Id;

@Repository
public interface purchaseRepository extends JpaRepository<purchase, Id>{

}
