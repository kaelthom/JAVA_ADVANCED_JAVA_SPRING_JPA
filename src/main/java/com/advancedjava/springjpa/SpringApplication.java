package com.advancedjava.springjpa;

import com.advancedjava.springjpa.dao.ProductDao;
import com.advancedjava.springjpa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringApplication {

    @Autowired
    ProductDao productDao;

    public void run() {

        Product newProduct = new Product();
        newProduct.setName("PC Asus 12354");
        productDao.create(newProduct);

        productDao.findAll();
    }
}
