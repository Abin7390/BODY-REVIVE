package com.bodyRevive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bodyRevive.entity.register;



@Repository
public interface RegisterRepository extends JpaRepository<register,String>{

}
