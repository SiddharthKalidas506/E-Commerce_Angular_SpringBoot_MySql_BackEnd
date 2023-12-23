package com.fullstack.springbootecommerce.Dao;

import com.fullstack.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@RepositoryRestResource(collectionResourceRel = "productCategory", path="product-category", exported = true)
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
