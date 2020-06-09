package com.advancedjava.springjpa;

import com.advancedjava.springjpa.dao.ProductDao;
import com.advancedjava.springjpa.entity.Product;
import com.advancedjava.springjpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringApplication {

    @Autowired
    ProductDao productDao;
    @Autowired
    ProductRepository productRepository;

    public void run() {

        Product newProduct = new Product();
        newProduct.setUnitPrice(250.);
        newProduct.setName("PC Asus 12354");
        newProduct.setDescription("cool pc");
        productDao.create(newProduct);

        productDao.findAll();

        List<Product> coolProducts = productRepository.findProductByDescriptionContaining("cool%");
        System.out.println(coolProducts);
        List<Product> cheapProducts = productRepository.findProductByUnitPriceBetween(0d, 500d);
        System.out.println(cheapProducts);
    }
}
