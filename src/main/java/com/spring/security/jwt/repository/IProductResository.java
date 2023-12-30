package com.spring.security.jwt.repository;

import com.spring.security.jwt.model.ProductModel;

import java.util.List;

public interface IProductResository {
    public List<ProductModel> findAll();
}
