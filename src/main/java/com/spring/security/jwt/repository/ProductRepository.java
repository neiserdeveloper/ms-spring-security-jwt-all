package com.spring.security.jwt.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.spring.security.jwt.model.ProductModel;

import java.util.List;

@Repository
public class ProductRepository implements  IProductResository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ProductModel> findAll() {
       String SQL = "SELECT * FROM products";
       return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(ProductModel.class));
    }

}
