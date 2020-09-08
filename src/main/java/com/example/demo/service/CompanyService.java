package com.example.demo.service;

import com.example.demo.model.Company;

import java.util.List;

public interface CompanyService {

    Company createCompany(Company company);

    List<Company> getAllCompanies();
}
