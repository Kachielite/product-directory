package com.derrick.inventory.dao;

import com.derrick.inventory.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{
    // define variable for entity manager
    private EntityManager entityManager;

    // construction injection
    @Autowired
    public ProductDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public Product save(Product product) {
        return entityManager.merge(product);
    }

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> theQuery = entityManager.createQuery("From Product", Product.class);
        return theQuery.getResultList();
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void deleteById(int id) {
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
    }
}
