package com.example.demo.service.impl;

import com.example.demo.dao.CompanyDao;
import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyDao companyDao;

    @Override
    public Company createCompany(Company company) {
        return companyDao.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        List<Company> companies = companyDao.findAllCompanies();
        return companies;
    }
}
