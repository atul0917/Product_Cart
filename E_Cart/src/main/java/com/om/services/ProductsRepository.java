package com.om.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.om.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
