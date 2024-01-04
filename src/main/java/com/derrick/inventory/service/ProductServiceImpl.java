package com.derrick.inventory.service;

import com.derrick.inventory.dao.ProductDAO;
import com.derrick.inventory.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    ProductDAO productDAO;

    public ProductServiceImpl(ProductDAO theProductDAO){
        productDAO = theProductDAO;
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return productDAO.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        productDAO.deleteById(id);
    }
}
