package com.example.RestApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RestApi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
