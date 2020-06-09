package com.advancedjava.springjpa.dao;

import com.advancedjava.springjpa.entity.Product;

import java.util.List;

public interface GenericDAO<T, K> {

    List<T> findAll();

    T findOne(K id);

    Product update(T entity);

    void delete(T entity);

    void deleteByKey(K id);

    Product create(T entity);

}
