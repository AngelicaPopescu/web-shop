package com.codecool.shop.dao;

import com.codecool.shop.model.Product;

import java.util.HashMap;

public interface CartDao {

    void add(Product product);

    void removeOne(Product product);

    HashMap<Product, Integer> getAll();

    void setDiscount(Integer discount);

}
