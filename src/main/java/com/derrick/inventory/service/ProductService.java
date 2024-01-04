package com.derrick.inventory.service;

import com.derrick.inventory.entity.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Product findById(int id);

    void deleteById(int id);
}
