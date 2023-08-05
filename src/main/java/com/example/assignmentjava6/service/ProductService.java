package com.example.assignmentjava6.service;

import com.example.assignmentjava6.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product findById(Integer id);

    List<Product> findByCategory(String id);
}
