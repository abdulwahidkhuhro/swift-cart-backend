package com.swiftcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swiftcart.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
