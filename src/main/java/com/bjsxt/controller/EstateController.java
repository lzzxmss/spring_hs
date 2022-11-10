package com.bjsxt.controller;

import com.bjsxt.pojo.Estate;
import com.bjsxt.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/estate")
@RestController
public class EstateController {

    @Autowired
    private EstateService  estateService;

    @RequestMapping("/list")
    public List<Estate>  findAll(){

        return  estateService.findAll();
    }

}
