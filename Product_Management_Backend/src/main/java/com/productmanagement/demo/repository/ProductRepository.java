package com.productmanagement.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagement.demo.models.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>
{
}
