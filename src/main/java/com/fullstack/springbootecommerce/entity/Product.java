package com.fullstack.springbootecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
/*
@Data -> This will automatically create getters and setters methods for us
reduce the boiler plate code
*/
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private  ProductCategory category;
    @Column(name="sku")
    private String sku;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String Description;
    @Column(name="unit_price")
    private BigDecimal unitPrice;
    @Column(name="image_url")
    private String imgeUrl;
    @Column(name="active")
    private Boolean active;
    @Column(name="unit_in_stock")
    private int unitInStock;
    @Column(name="date_created")
    private Date dateCreated;
    @Column(name="last_updated")
    private Date lastUpdated;
}
