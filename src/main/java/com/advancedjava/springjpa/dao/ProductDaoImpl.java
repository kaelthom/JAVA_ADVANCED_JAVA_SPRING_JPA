package com.advancedjava.springjpa.dao;

import com.advancedjava.springjpa.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Product> findAvailableProducts() {
        return em.createQuery("from Product p where p.available == 1").getResultList();
    }

    @Override
    public List<Product> findAll() {
        return em.createQuery("from Product").getResultList();
    }

    @Override
    public Product findOne(Integer id) {
        return em.find(Product.class, id);
    }

    @Override
    public Product update(Product entity) {
        return em.merge(entity);
    }

    @Override
    public void delete(Product entity) {
        em.remove(em.find(Product.class, entity.getId()));
    }

    @Override
    public void deleteByKey(Integer id) {
        em.remove(id);
    }

    @Override
    public Product create(Product entity) {
        em.persist(entity);
        return entity;
    }
}
