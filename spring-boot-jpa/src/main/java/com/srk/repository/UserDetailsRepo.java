package com.srk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.srk.entity.ProductDetails;
import com.srk.entity.UserInformation;

// JPA Repository
public interface UserDetailsRepo extends CrudRepository<UserInformation, Long>{

}
