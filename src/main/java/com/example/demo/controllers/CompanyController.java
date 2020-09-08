package com.example.demo.controllers;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/get-all-companies")
    public ResponseEntity getAllCompanies(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity createNewCompany(@RequestBody Company company){
        return ResponseEntity.ok(companyService.createCompany(company));
    }

}
