package com.example.RestApi.controller;

import com.example.RestApi.Repository.ProductRepository;
import com.example.RestApi.entities.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductController {
    @Autowired
    ProductRepository repository;

    // @RequestMapping(value = "/products/", method = RequestMethod.GET)
    @GetMapping("")
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    // @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }

    @PostMapping("")
    // @RequestMapping(value = "/products/", method = RequestMethod.POST)
    public Product updateProduct(@RequestBody Product productdata) {
        return repository.save(productdata);
    }

    // @RequestMapping(value = "/products/", method = RequestMethod.PUT)
    @PutMapping("")
    public Product updateProductBy(@RequestBody Product productData) {
        return repository.save(productData);
    }

    // @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("{id}")
    public void DeleteProduct(@PathVariable("id") long id) {
        repository.deleteById(id);
    }
}
