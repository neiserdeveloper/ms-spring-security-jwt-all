package com.spring.security.jwt.service;

import com.spring.security.jwt.model.ProductModel;
import com.spring.security.jwt.repository.IProductResository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements  IProductService{
    @Autowired
    private IProductResository iProductResository;

    @Override
    public List<ProductModel> findAll() {
        List<ProductModel> list;
        try{
            list = iProductResository.findAll();
        }catch (Exception ex){
            throw ex;
        }
        return list;
    }
}
