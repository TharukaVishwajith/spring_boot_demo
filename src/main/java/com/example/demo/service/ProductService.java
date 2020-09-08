package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;

public interface ProductService {

    Product createProduct(ProductDto product);

}
