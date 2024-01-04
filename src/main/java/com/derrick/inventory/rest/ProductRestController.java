package com.derrick.inventory.rest;


import com.derrick.inventory.entity.Product;
import com.derrick.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    ProductService productService;

    @Autowired
    public ProductRestController(ProductService theProductService){
        productService = theProductService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId){
        Product product = productService.findById(productId);
        if(productId < 0 || product == null){
            throw new RuntimeException("Product with id:" + productId + " can not be found");
        }
        return product;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        // if user provides id, set it to zero
        product.setId(0);
        return productService.save(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){

        return productService.save(product);
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId){
        productService.deleteById(productId);
        return "Product successfully deleted";
    }
}
