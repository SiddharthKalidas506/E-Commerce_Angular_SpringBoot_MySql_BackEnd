package com.fullstack.springbootecommerce.Dao;


import com.fullstack.springbootecommerce.entity.Product;
import com.fullstack.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository  extends JpaRepository<Product, Long> {
}
