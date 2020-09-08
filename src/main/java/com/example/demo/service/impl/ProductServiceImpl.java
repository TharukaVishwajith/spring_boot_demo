package com.example.demo.service.impl;

import com.example.demo.dto.ProductDto;
import com.example.demo.dao.CompanyDao;
import com.example.demo.dao.ProductDao;
import com.example.demo.model.Company;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Autowired
    CompanyDao companyDao;

    @Override
    public Product createProduct(ProductDto product) {
        Product p = new Product(product.getProductName(),product.getDescription());
        if(product.getCompanyId() != null) {
            Company company = companyDao.findById(product.getCompanyId()).orElseGet(null);
            p.setCompany(company);
        }
        return productDao.save(p);
    }
}
