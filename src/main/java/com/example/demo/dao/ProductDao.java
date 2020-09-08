package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Long>{

}
