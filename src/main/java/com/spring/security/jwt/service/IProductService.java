package com.spring.security.jwt.service;

import com.spring.security.jwt.model.ProductModel;

import java.util.List;

public interface IProductService {
    public List<ProductModel> findAll();
}
