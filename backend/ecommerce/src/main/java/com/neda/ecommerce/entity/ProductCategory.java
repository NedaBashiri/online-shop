package com.neda.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

    public ProductCategory() {
    }

    public ProductCategory(Long id, String categoryName, Set<Product> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.products = products;
    }

    public ProductCategory(String categoryName, Set<Product> products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public ProductCategory setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ProductCategory setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public ProductCategory setProducts(Set<Product> products) {
        this.products = products;
        return this;
    }
}
