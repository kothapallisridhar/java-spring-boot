package com.srk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srk.entity.ProductDetails;

// JPA Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer>{

}
