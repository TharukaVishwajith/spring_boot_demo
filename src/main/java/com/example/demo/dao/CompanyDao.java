package com.example.demo.dao;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanyDao extends CrudRepository<Company,Long> {

    @Query(value = "SELECT c FROM Company c")
    List<Company> findAllCompanies();
}
