package com.bodyRevive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodyRevive.entity.checkup;

import jakarta.persistence.Id;

@Repository
public interface CheckupRepository extends JpaRepository<checkup,Id> {

}
