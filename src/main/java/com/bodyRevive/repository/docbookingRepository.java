package com.bodyRevive.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodyRevive.entity.docbooking;


import jakarta.persistence.Id;

@Repository
public interface docbookingRepository extends JpaRepository<docbooking,Id> {



}
