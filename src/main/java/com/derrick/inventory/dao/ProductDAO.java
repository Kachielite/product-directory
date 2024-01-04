package com.derrick.inventory.dao;

import com.derrick.inventory.entity.Product;

import java.util.List;

public interface ProductDAO {
    Product save(Product product);

    List<Product> findAll();

    Product findById(int id);

    void deleteById(int id);
}
