package com.example.assignmentjava6.service.impl;

import com.example.assignmentjava6.entity.Product;
import com.example.assignmentjava6.repository.ProductRepository;
import com.example.assignmentjava6.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository ;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findByCategory(String id) {
        return productRepository.findByCategory(id);
    }
}
