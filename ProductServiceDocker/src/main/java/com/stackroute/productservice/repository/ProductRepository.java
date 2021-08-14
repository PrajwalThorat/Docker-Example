package com.stackroute.productservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.productservice.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
    public List<Product> findAllByCategory(String category);
    public List<Product> findAllByProductName(String name);
}
