package com.advancedjava.springjpa.dao;

import com.advancedjava.springjpa.entity.Product;

import java.util.List;

public interface ProductDao extends GenericDAO<Product, Integer> {
    List<Product> findAvailableProducts();
}
