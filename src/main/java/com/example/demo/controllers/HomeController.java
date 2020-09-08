package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/demo")
//    @ResponseBody
    public ModelAndView demo(){
        return new ModelAndView("demo.html");
    }

    @RequestMapping("/get-values1")
    @ResponseBody
    public String getValues(@RequestParam("name") String name){
        System.out.println(name);
        return  "Hi " + name + "!";
    }


    @RequestMapping("/get-values")
    @ResponseBody
    public ResponseEntity getValuesResponseEntity(@RequestParam("name") String name){
        System.out.println(name);
        return  ResponseEntity.ok(name);
    }

    @RequestMapping("/test1")
    public String  home(HttpServletRequest request, Model model){
        model.addAttribute("name", 1);
        return "test";
    }


}
