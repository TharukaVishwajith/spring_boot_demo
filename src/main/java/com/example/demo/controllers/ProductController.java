package com.example.demo.controllers;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("product")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Product> createNewProduct(@RequestBody ProductDto productDto){
        return ResponseEntity.ok(productService.createProduct(productDto));
    }

    @RequestMapping(value = "/save")
    public ResponseEntity<Product> createNewProduct1(){
        ProductDto p = new ProductDto();
        p.setDescription("Test Product");
        p.setProductName("Test 123");
        return ResponseEntity.ok(productService.createProduct(p));
    }
}
