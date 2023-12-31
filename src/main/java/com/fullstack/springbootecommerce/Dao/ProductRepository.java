package com.fullstack.springbootecommerce.Dao;


import com.fullstack.springbootecommerce.entity.Product;
import com.fullstack.springbootecommerce.entity.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.domain.Pageable;

/*
HOSTNAME Syntax
Protocal + HostName + Port
Eg 1 -> Same origin
http://locahost:4200 == http://locahost:4200
eg 2 > Different Origin
http://locahost:4200 != http://locahost:8080
 */
@RepositoryRestResource(collectionResourceRel = "product", path = "products")
@CrossOrigin("http://localhost:4200")
public interface ProductRepository  extends JpaRepository<Product, Long> {
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
